.class public abstract Landroid/gov/nist/core/ParserCore;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final debug:Z

.field static nesting_level:I


# instance fields
.field protected lexer:Landroid/gov/nist/core/LexerCore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/Debug;->parserDebug:Z

    .line 2
    .line 3
    sput-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public dbg_enter(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    sget v2, Landroid/gov/nist/core/ParserCore;->nesting_level:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    const-string v2, ">"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, "\nlexer buffer = \n"

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getRest()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    sget p0, Landroid/gov/nist/core/ParserCore;->nesting_level:I

    .line 58
    .line 59
    add-int/lit8 p0, p0, 0x1

    .line 60
    .line 61
    sput p0, Landroid/gov/nist/core/ParserCore;->nesting_level:I

    .line 62
    .line 63
    return-void
.end method

.method public dbg_leave(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    sget v2, Landroid/gov/nist/core/ParserCore;->nesting_level:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    const-string v2, "<"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, "\nlexer buffer = \n"

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getRest()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    sget p0, Landroid/gov/nist/core/ParserCore;->nesting_level:I

    .line 58
    .line 59
    add-int/lit8 p0, p0, -0x1

    .line 60
    .line 61
    sput p0, Landroid/gov/nist/core/ParserCore;->nesting_level:I

    .line 62
    .line 63
    return-void
.end method

.method public nameValue()Landroid/gov/nist/core/NameValue;
    .locals 1

    const/16 v0, 0x3d

    .line 169
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->nameValue(C)Landroid/gov/nist/core/NameValue;

    move-result-object p0

    return-object p0
.end method

.method public nameValue(C)Landroid/gov/nist/core/NameValue;
    .locals 9

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "nameValue"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 11
    .line 12
    const/16 v3, 0xfff

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    :try_start_1
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 30
    .line 31
    invoke-virtual {v5, v4}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 32
    .line 33
    .line 34
    move-result v5
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    const-string v6, ""

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    if-ne v5, p1, :cond_7

    .line 39
    .line 40
    :try_start_2
    iget-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 41
    .line 42
    invoke-virtual {p1, v7}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 51
    .line 52
    invoke-virtual {p1, v4}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    const/16 v5, 0x22

    .line 57
    .line 58
    if-ne p1, v5, :cond_1

    .line 59
    .line 60
    iget-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/gov/nist/core/LexerCore;->quotedString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    move p1, v7

    .line 67
    move v7, v4

    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 72
    .line 73
    const/16 v8, 0x5b

    .line 74
    .line 75
    if-ne p1, v8, :cond_3

    .line 76
    .line 77
    const/16 p1, 0x1004

    .line 78
    .line 79
    :try_start_3
    invoke-virtual {v5, p1}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object p1, p1, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 89
    .line 90
    if-nez p1, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move-object v6, p1

    .line 94
    move v7, v4

    .line 95
    :goto_0
    move p1, v4

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-virtual {v5, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p1, p1, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 107
    .line 108
    if-nez p1, :cond_4

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    move-object v6, p1

    .line 112
    move p1, v4

    .line 113
    move v7, p1

    .line 114
    :goto_1
    new-instance v3, Landroid/gov/nist/core/NameValue;

    .line 115
    .line 116
    iget-object v5, v2, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {v3, v5, v6, v7}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 119
    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    invoke-virtual {v3}, Landroid/gov/nist/core/NameValue;->setQuotedValue()V
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 124
    .line 125
    .line 126
    :cond_5
    if-eqz v0, :cond_6

    .line 127
    .line 128
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    return-object v3

    .line 132
    :cond_7
    :try_start_4
    new-instance p1, Landroid/gov/nist/core/NameValue;

    .line 133
    .line 134
    iget-object v3, v2, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 135
    .line 136
    invoke-direct {p1, v3, v6, v7}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_4
    .catch Ljava/text/ParseException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 137
    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    return-object p1

    .line 145
    :catch_0
    :try_start_5
    new-instance p1, Landroid/gov/nist/core/NameValue;

    .line 146
    .line 147
    iget-object v0, v2, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    invoke-direct {p1, v0, v2, v4}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 151
    .line 152
    .line 153
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 154
    .line 155
    if-eqz v0, :cond_9

    .line 156
    .line 157
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_9
    return-object p1

    .line 161
    :goto_2
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 162
    .line 163
    if-eqz v0, :cond_a

    .line 164
    .line 165
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_a
    throw p1
.end method

.method public peekLine(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, " "

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->peekLine()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Landroid/gov/nist/core/Debug;->println(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
