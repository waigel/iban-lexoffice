#bin/bash
echo "Download i18n files from tolgee";

curl -O -J -L --request GET 'https://app.tolgee.io/v2/projects/export?languages=de-DE,en-US&zip=true&format=JSON' \
--header 'X-API-Key: '$TOLGEE_DOWNLOAD_API_KEY

echo "Unzip i18n files"
unzip -o iban-lexoffice.zip -d src/i18n
rm iban-lexoffice.zip

echo "i18n installed. Lets translate ...."
