.class public Landroid/gov/nist/javax/sdp/parser/KeyFieldParser;
.super Landroid/gov/nist/javax/sdp/parser/SDPParser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sdp/parser/SDPParser;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sdp/parser/Lexer;

    .line 5
    .line 6
    const-string v1, "charLexer"

    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, Landroid/gov/nist/javax/sdp/parser/Lexer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public keyField()Landroid/gov/nist/javax/sdp/fields/KeyField;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 3
    .line 4
    const/16 v2, 0x6b

    .line 5
    .line 6
    invoke-virtual {v1, v2}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 15
    .line 16
    const/16 v2, 0x3d

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/gov/nist/javax/sdp/fields/KeyField;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v2, Landroid/gov/nist/core/NameValue;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/gov/nist/core/NameValue;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->markInputPosition()I

    .line 39
    .line 40
    .line 41
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 42
    :try_start_1
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 43
    .line 44
    const/16 v4, 0x3a

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/StringTokenizer;->getNextToken(C)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    invoke-virtual {v4, v5}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->getRest()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    new-instance v5, Landroid/gov/nist/core/NameValue;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-direct {v5, v3, v4}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catch_0
    :try_start_2
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 77
    .line 78
    invoke-virtual {v3, v2}, Landroid/gov/nist/core/LexerCore;->rewindInputPosition(I)V

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->getRest()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    new-instance v5, Landroid/gov/nist/core/NameValue;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-direct {v5, v2, v0}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    invoke-virtual {v5}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sdp/fields/KeyField;->setType(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Landroid/gov/nist/core/NameValue;->getValueAsObject()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sdp/fields/KeyField;->setKeyData(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 117
    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_0
    new-instance v1, Ljava/text/ParseException;

    .line 121
    .line 122
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->getBuffer()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 129
    .line 130
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->getPtr()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-direct {v1, v2, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 135
    .line 136
    .line 137
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 138
    :catch_1
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->getBuffer()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object p0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getPtr()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-static {p0, v1}, La/hny;->j(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v0
.end method

.method public parse()Landroid/gov/nist/javax/sdp/fields/SDPField;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/parser/KeyFieldParser;->keyField()Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
