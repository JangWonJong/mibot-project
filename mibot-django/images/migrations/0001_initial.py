# Generated by Django 4.0.5 on 2022-06-21 11:42

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Image',
            fields=[
                ('imageid', models.CharField(max_length=10, primary_key=True, serialize=False)),
                ('regDate', models.DateField()),
            ],
            options={
                'db_table': 'images',
            },
        ),
    ]
