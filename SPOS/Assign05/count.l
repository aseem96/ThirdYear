% {
int charCount=0,wordCount=0,lineCount=0;

% }
word [^\t|\n]*
%%
{ word } { wordCount++;charCount+=yyleng;}
[\n] {charCount++;lineCount++;}
. {charCount++;}
%%
main() {

char * s;
scanf("%S",&s);
yylex();
printf("Characters:%d,Words:%d,Lines:%d\n",charCount,wordCount,lineCount);

}

