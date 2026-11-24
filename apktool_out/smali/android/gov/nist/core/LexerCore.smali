.class public Landroid/gov/nist/core/LexerCore;
.super Landroid/gov/nist/core/StringTokenizer;
.source "SourceFile"


# static fields
.field public static final ALPHA:I = 0x1003

.field static final ALPHADIGIT_VALID_CHARS:C = '\ufffd'

.field static final ALPHA_VALID_CHARS:C = '\uffff'

.field public static final AND:I = 0x26

.field public static final AT:I = 0x40

.field public static final BACKSLASH:I = 0x5c

.field public static final BACK_QUOTE:I = 0x60

.field public static final BAR:I = 0x7c

.field public static final COLON:I = 0x3a

.field public static final DIGIT:I = 0x1002

.field static final DIGIT_VALID_CHARS:C = '\ufffe'

.field public static final DOLLAR:I = 0x24

.field public static final DOT:I = 0x2e

.field public static final DOUBLEQUOTE:I = 0x22

.field public static final END:I = 0x1000

.field public static final EQUALS:I = 0x3d

.field public static final EXCLAMATION:I = 0x21

.field public static final GREATER_THAN:I = 0x3e

.field public static final HAT:I = 0x5e

.field public static final HT:I = 0x9

.field public static final ID:I = 0xfff

.field public static final ID_NO_WHITESPACE:I = 0xffd

.field public static final IPV6:I = 0x1004

.field public static final LESS_THAN:I = 0x3c

.field public static final LPAREN:I = 0x28

.field public static final L_CURLY:I = 0x7b

.field public static final L_SQUARE_BRACKET:I = 0x5b

.field public static final MINUS:I = 0x2d

.field public static final NULL:I = 0x0

.field public static final PERCENT:I = 0x25

.field public static final PLUS:I = 0x2b

.field public static final POUND:I = 0x23

.field public static final QUESTION:I = 0x3f

.field public static final QUOTE:I = 0x27

.field public static final RPAREN:I = 0x29

.field public static final R_CURLY:I = 0x7d

.field public static final R_SQUARE_BRACKET:I = 0x5d

.field public static final SAFE:I = 0xffe

.field public static final SEMICOLON:I = 0x3b

.field public static final SLASH:I = 0x2f

.field public static final SP:I = 0x20

.field public static final STAR:I = 0x2a

.field public static final START:I = 0x800

.field public static final TILDE:I = 0x7e

.field public static final UNDERSCORE:I = 0x5f

.field public static final WHITESPACE:I = 0x1001

.field protected static final globalSymbolTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected static final lexerTables:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field protected currentLexer:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected currentLexerName:Ljava/lang/String;

.field protected currentMatch:Landroid/gov/nist/core/Token;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroid/gov/nist/core/LexerCore;->globalSymbolTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroid/gov/nist/core/LexerCore;->lexerTables:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/StringTokenizer;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 10
    .line 11
    const-string v0, "charLexer"

    .line 12
    .line 13
    iput-object v0, p0, Landroid/gov/nist/core/LexerCore;->currentLexerName:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0, p2}, Landroid/gov/nist/core/StringTokenizer;-><init>(Ljava/lang/String;)V

    .line 17
    iput-object p1, p0, Landroid/gov/nist/core/LexerCore;->currentLexerName:Ljava/lang/String;

    return-void
.end method

.method public static charAsString(C)Ljava/lang/String;
    .locals 0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final isTokenChar(C)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/gov/nist/core/StringTokenizer;->isAlphaDigit(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/16 v0, 0x21

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x25

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x27

    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x7e

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x2a

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x2b

    .line 30
    .line 31
    if-eq p0, v0, :cond_1

    .line 32
    .line 33
    const/16 v0, 0x2d

    .line 34
    .line 35
    if-eq p0, v0, :cond_1

    .line 36
    .line 37
    const/16 v0, 0x2e

    .line 38
    .line 39
    if-eq p0, v0, :cond_1

    .line 40
    .line 41
    const/16 v0, 0x5f

    .line 42
    .line 43
    if-eq p0, v0, :cond_1

    .line 44
    .line 45
    const/16 v0, 0x60

    .line 46
    .line 47
    if-eq p0, v0, :cond_1

    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_1
    return v1
.end method


# virtual methods
.method public SPorHT()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    :goto_0
    const/16 v2, 0x20

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 19
    .line 20
    .line 21
    move-result v1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    :cond_1
    return-void
.end method

.method public addKeyword(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/gov/nist/javax/sip/Utils;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object p0, p0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    sget-object p0, Landroid/gov/nist/core/LexerCore;->globalSymbolTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {p0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public byteStringNoComma()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/16 v2, 0x2c

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v2, 0x1

    .line 21
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public byteStringNoSemicolon()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/16 v2, 0xa

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    const/16 v2, 0x3b

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    const/16 v2, 0x2c

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 v2, 0x1

    .line 27
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public byteStringNoSlash()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/16 v2, 0xa

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    const/16 v2, 0x2f

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v2, 0x1

    .line 23
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public charAsString(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 2
    .line 3
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    invoke-static {v0, p0, p1}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public comment()Ljava/lang/String;
    .locals 4

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
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x28

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    return-object v3

    .line 17
    :cond_0
    const/4 v1, 0x1

    .line 18
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->getNextChar()C

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x29

    .line 26
    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    if-eqz v1, :cond_4

    .line 35
    .line 36
    const/16 v2, 0x5c

    .line 37
    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->getNextChar()C

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, " : unexpected EOL"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 73
    .line 74
    invoke-static {p0, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v3

    .line 78
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, " :unexpected EOL"

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 102
    .line 103
    invoke-static {p0, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v3
.end method

.method public consumeValidChars([C)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->hasMoreChars()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    move v3, v1

    .line 14
    move v4, v3

    .line 15
    :goto_1
    const/4 v5, 0x1

    .line 16
    if-ge v3, v0, :cond_2

    .line 17
    .line 18
    aget-char v4, p1, v3

    .line 19
    .line 20
    packed-switch v4, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    if-ne v2, v4, :cond_0

    .line 24
    .line 25
    move v4, v5

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    move v4, v1

    .line 28
    goto :goto_2

    .line 29
    :pswitch_0
    invoke-static {v2}, Landroid/gov/nist/core/StringTokenizer;->isAlpha(C)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    goto :goto_2

    .line 34
    :pswitch_1
    invoke-static {v2}, Landroid/gov/nist/core/StringTokenizer;->isDigit(C)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    goto :goto_2

    .line 39
    :pswitch_2
    invoke-static {v2}, Landroid/gov/nist/core/StringTokenizer;->isAlphaDigit(C)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    :goto_2
    if-eqz v4, :cond_1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_3
    if-eqz v4, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0, v5}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    :cond_3
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0xfffd
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public createParseException()Ljava/text/ParseException;
    .locals 2

    .line 1
    new-instance v0, Ljava/text/ParseException;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getBuffer()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getBuffer()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getNextId()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->ttoken()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getNextIdNoWhiteSpace()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->ttokenNoWhiteSpace()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getNextIp()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->tIpv6address()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getNextToken()Landroid/gov/nist/core/Token;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPtr()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    return p0
.end method

.method public getRest()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    iget v1, p0, Landroid/gov/nist/core/StringTokenizer;->bufferLen:I

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    const-string p0, ""

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 15
    .line 16
    sub-int/2addr v1, v0

    .line 17
    invoke-static {p0, v0, v1}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public getString(C)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    const-string v4, "unexpected EOL"

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    if-ne v2, p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v5}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const/16 v6, 0x5c

    .line 28
    .line 29
    if-ne v2, v6, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v5}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v5}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 65
    .line 66
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v3

    .line 70
    :cond_2
    invoke-virtual {p0, v5}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 95
    .line 96
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v3
.end method

.method public lookupToken(I)Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x800

    .line 2
    .line 3
    if-le p1, p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Landroid/gov/nist/core/LexerCore;->globalSymbolTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/String;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    int-to-char p0, p1

    .line 19
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Character;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public markInputPosition()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    return p0
.end method

.method public match(I)Landroid/gov/nist/core/Token;
    .locals 4

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/Debug;->parserDebug:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "match "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Landroid/gov/nist/core/Debug;->println(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/16 v0, 0x800

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/16 v2, 0x1000

    .line 26
    .line 27
    if-le p1, v0, :cond_8

    .line 28
    .line 29
    if-ge p1, v2, :cond_8

    .line 30
    .line 31
    const-string v0, "\nID expected"

    .line 32
    .line 33
    const/16 v2, 0xfff

    .line 34
    .line 35
    if-ne p1, v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->startsId()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getNextId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Landroid/gov/nist/core/Token;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/gov/nist/core/Token;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 53
    .line 54
    iput-object p1, v0, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 55
    .line 56
    iput v2, v0, Landroid/gov/nist/core/Token;->tokenType:I

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 66
    .line 67
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 78
    .line 79
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_2
    const/16 v2, 0xffe

    .line 84
    .line 85
    if-ne p1, v2, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->startsSafeToken()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->ttokenSafe()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Landroid/gov/nist/core/Token;

    .line 98
    .line 99
    invoke-direct {v0}, Landroid/gov/nist/core/Token;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 103
    .line 104
    iput-object p1, v0, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 105
    .line 106
    iput v2, v0, Landroid/gov/nist/core/Token;->tokenType:I

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 116
    .line 117
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 128
    .line 129
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_4
    const/16 v0, 0xffd

    .line 134
    .line 135
    if-ne p1, v0, :cond_6

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->startsIdNoWhiteSpace()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getNextIdNoWhiteSpace()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance v1, Landroid/gov/nist/core/Token;

    .line 148
    .line 149
    invoke-direct {v1}, Landroid/gov/nist/core/Token;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v1, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 153
    .line 154
    iput-object p1, v1, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 155
    .line 156
    iput v0, v1, Landroid/gov/nist/core/Token;->tokenType:I

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v0, "\nID no white space expected"

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 180
    .line 181
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-object v1

    .line 185
    :cond_6
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getNextId()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object v2, p0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 190
    .line 191
    invoke-static {v0}, Landroid/gov/nist/javax/sip/Utils;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, Ljava/lang/Integer;

    .line 200
    .line 201
    if-eqz v2, :cond_7

    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-ne v2, p1, :cond_7

    .line 208
    .line 209
    new-instance v1, Landroid/gov/nist/core/Token;

    .line 210
    .line 211
    invoke-direct {v1}, Landroid/gov/nist/core/Token;-><init>()V

    .line 212
    .line 213
    .line 214
    iput-object v1, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 215
    .line 216
    iput-object v0, v1, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 217
    .line 218
    iput p1, v1, Landroid/gov/nist/core/Token;->tokenType:I

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    iget-object v2, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 228
    .line 229
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v2, "\nUnexpected Token : "

    .line 233
    .line 234
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 245
    .line 246
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-object v1

    .line 250
    :cond_8
    const/4 v0, 0x0

    .line 251
    const/4 v3, 0x1

    .line 252
    if-le p1, v2, :cond_d

    .line 253
    .line 254
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    const/16 v2, 0x1002

    .line 259
    .line 260
    if-ne p1, v2, :cond_a

    .line 261
    .line 262
    invoke-static {v0}, Landroid/gov/nist/core/StringTokenizer;->isDigit(C)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-eqz v2, :cond_9

    .line 267
    .line 268
    new-instance v1, Landroid/gov/nist/core/Token;

    .line 269
    .line 270
    invoke-direct {v1}, Landroid/gov/nist/core/Token;-><init>()V

    .line 271
    .line 272
    .line 273
    iput-object v1, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 274
    .line 275
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iput-object v0, v1, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 280
    .line 281
    iget-object v0, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 282
    .line 283
    iput p1, v0, Landroid/gov/nist/core/Token;->tokenType:I

    .line 284
    .line 285
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 286
    .line 287
    .line 288
    goto :goto_0

    .line 289
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 295
    .line 296
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v0, "\nExpecting DIGIT"

    .line 300
    .line 301
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 309
    .line 310
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v1

    .line 314
    :cond_a
    const/16 v2, 0x1003

    .line 315
    .line 316
    if-ne p1, v2, :cond_c

    .line 317
    .line 318
    invoke-static {v0}, Landroid/gov/nist/core/StringTokenizer;->isAlpha(C)Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-eqz v2, :cond_b

    .line 323
    .line 324
    new-instance v1, Landroid/gov/nist/core/Token;

    .line 325
    .line 326
    invoke-direct {v1}, Landroid/gov/nist/core/Token;-><init>()V

    .line 327
    .line 328
    .line 329
    iput-object v1, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 330
    .line 331
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    iput-object v0, v1, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v0, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 338
    .line 339
    iput p1, v0, Landroid/gov/nist/core/Token;->tokenType:I

    .line 340
    .line 341
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 342
    .line 343
    .line 344
    goto :goto_0

    .line 345
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 351
    .line 352
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v0, "\nExpecting ALPHA"

    .line 356
    .line 357
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 365
    .line 366
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return-object v1

    .line 370
    :cond_c
    const/16 v0, 0x1004

    .line 371
    .line 372
    if-ne p1, v0, :cond_e

    .line 373
    .line 374
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getNextIp()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    new-instance v1, Landroid/gov/nist/core/Token;

    .line 379
    .line 380
    invoke-direct {v1}, Landroid/gov/nist/core/Token;-><init>()V

    .line 381
    .line 382
    .line 383
    iput-object v1, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 384
    .line 385
    iput-object p1, v1, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 386
    .line 387
    iput v0, v1, Landroid/gov/nist/core/Token;->tokenType:I

    .line 388
    .line 389
    goto :goto_0

    .line 390
    :cond_d
    int-to-char p1, p1

    .line 391
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-ne v0, p1, :cond_f

    .line 396
    .line 397
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 398
    .line 399
    .line 400
    :cond_e
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/core/LexerCore;->currentMatch:Landroid/gov/nist/core/Token;

    .line 401
    .line 402
    return-object p0

    .line 403
    :cond_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    iget-object v3, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 409
    .line 410
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-string v3, "\nExpecting  >>>"

    .line 414
    .line 415
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string p1, "<<< got >>>"

    .line 422
    .line 423
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    const-string p1, "<<<"

    .line 430
    .line 431
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 439
    .line 440
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 441
    .line 442
    .line 443
    return-object v1
.end method

.method public number()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-static {v2}, Landroid/gov/nist/core/StringTokenizer;->isDigit(C)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {v3}, Landroid/gov/nist/core/StringTokenizer;->isDigit(C)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 33
    .line 34
    iget v2, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 35
    .line 36
    sub-int/2addr v2, v0

    .line 37
    invoke-static {v1, v0, v2}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    new-instance v2, Ljava/text/ParseException;

    .line 43
    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, ": Unexpected token at "

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget v3, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 71
    .line 72
    invoke-direct {v2, v1, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    throw v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :catch_0
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 77
    .line 78
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 79
    .line 80
    sub-int/2addr p0, v0

    .line 81
    invoke-static {v1, v0, p0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public peekNextId()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->ttoken()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 8
    .line 9
    iput v2, p0, Landroid/gov/nist/core/StringTokenizer;->savedPtr:I

    .line 10
    .line 11
    iput v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 12
    .line 13
    return-object v1
.end method

.method public peekNextToken()Landroid/gov/nist/core/Token;
    .locals 1

    const/4 v0, 0x1

    .line 103
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/LexerCore;->peekNextToken(I)[Landroid/gov/nist/core/Token;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    return-object p0
.end method

.method public peekNextToken(I)[Landroid/gov/nist/core/Token;
    .locals 6

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    new-array v1, p1, [Landroid/gov/nist/core/Token;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    if-ge v2, p1, :cond_4

    .line 7
    .line 8
    new-instance v3, Landroid/gov/nist/core/Token;

    .line 9
    .line 10
    invoke-direct {v3}, Landroid/gov/nist/core/Token;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->startsId()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->ttoken()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iput-object v4, v3, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v4}, Landroid/gov/nist/javax/sip/Utils;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v5, p0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    iget-object v5, p0, Landroid/gov/nist/core/LexerCore;->currentLexer:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iput v4, v3, Landroid/gov/nist/core/Token;->tokenType:I

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const/16 v4, 0xfff

    .line 53
    .line 54
    iput v4, v3, Landroid/gov/nist/core/Token;->tokenType:I

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->getNextChar()C

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iput-object v5, v3, Landroid/gov/nist/core/Token;->tokenValue:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v4}, Landroid/gov/nist/core/StringTokenizer;->isAlpha(C)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    const/16 v4, 0x1003

    .line 74
    .line 75
    iput v4, v3, Landroid/gov/nist/core/Token;->tokenType:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {v4}, Landroid/gov/nist/core/StringTokenizer;->isDigit(C)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    const/16 v4, 0x1002

    .line 85
    .line 86
    iput v4, v3, Landroid/gov/nist/core/Token;->tokenType:I

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    iput v4, v3, Landroid/gov/nist/core/Token;->tokenType:I

    .line 90
    .line 91
    :goto_1
    aput-object v3, v1, v2

    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    iget p1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 97
    .line 98
    iput p1, p0, Landroid/gov/nist/core/StringTokenizer;->savedPtr:I

    .line 99
    .line 100
    iput v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 101
    .line 102
    return-object v1
.end method

.method public quotedString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/16 v3, 0x22

    .line 11
    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->getNextChar()C

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 26
    .line 27
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 28
    .line 29
    sub-int/2addr p0, v0

    .line 30
    sub-int/2addr p0, v1

    .line 31
    invoke-static {v2, v0, p0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    if-eqz v2, :cond_3

    .line 37
    .line 38
    const/16 v4, 0x5c

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, " :unexpected EOL"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 70
    .line 71
    invoke-static {p0, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method

.method public rewindInputPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    return-void
.end method

.method public selectLexer(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/LexerCore;->currentLexerName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public startsId()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    invoke-static {p0}, Landroid/gov/nist/core/LexerCore;->isTokenChar(C)Z

    .line 7
    .line 8
    .line 9
    move-result p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return p0

    .line 11
    :catch_0
    return v0
.end method

.method public startsIdNoWhiteSpace()Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 3
    .line 4
    .line 5
    move-result p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    if-eq p0, v1, :cond_0

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    if-eq p0, v1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    if-eq p0, v1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :catch_0
    :cond_0
    return v0
.end method

.method public startsSafeToken()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    invoke-static {p0}, Landroid/gov/nist/core/StringTokenizer;->isAlphaDigit(C)Z

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    const/16 v1, 0x27

    .line 15
    .line 16
    if-eq p0, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, 0x3d

    .line 19
    .line 20
    if-eq p0, v1, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x5b

    .line 23
    .line 24
    if-eq p0, v1, :cond_1

    .line 25
    .line 26
    const/16 v1, 0x2a

    .line 27
    .line 28
    if-eq p0, v1, :cond_1

    .line 29
    .line 30
    const/16 v1, 0x2b

    .line 31
    .line 32
    if-eq p0, v1, :cond_1

    .line 33
    .line 34
    const/16 v1, 0x3a

    .line 35
    .line 36
    if-eq p0, v1, :cond_1

    .line 37
    .line 38
    const/16 v1, 0x3b

    .line 39
    .line 40
    if-eq p0, v1, :cond_1

    .line 41
    .line 42
    const/16 v1, 0x3f

    .line 43
    .line 44
    if-eq p0, v1, :cond_1

    .line 45
    .line 46
    const/16 v1, 0x40

    .line 47
    .line 48
    if-eq p0, v1, :cond_1

    .line 49
    .line 50
    packed-switch p0, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    packed-switch p0, :pswitch_data_1

    .line 54
    .line 55
    .line 56
    packed-switch p0, :pswitch_data_2

    .line 57
    .line 58
    .line 59
    packed-switch p0, :pswitch_data_3

    .line 60
    .line 61
    .line 62
    return v0

    .line 63
    :cond_1
    :pswitch_0
    return v2

    .line 64
    :catch_0
    return v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    :pswitch_data_1
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x5d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public tIpv6address()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 2
    .line 3
    iget v1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    sub-int/2addr v2, v1

    .line 7
    invoke-static {v0, v1, v2}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Landroid/gov/nist/core/HostNameParser;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Landroid/gov/nist/core/HostNameParser;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {v1, v0}, Landroid/gov/nist/core/HostNameParser;->hostPort(Z)Landroid/gov/nist/core/HostPort;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/gov/nist/core/HostPort;->getHost()Landroid/gov/nist/core/Host;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, Landroid/gov/nist/core/Host;->hostname:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/gov/nist/core/HostPort;->getHost()Landroid/gov/nist/core/Host;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object p0, p0, Landroid/gov/nist/core/Host;->hostname:Ljava/lang/String;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-object p0

    .line 41
    :catch_0
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public ttoken()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->hasMoreChars()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Landroid/gov/nist/core/LexerCore;->isTokenChar(C)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 26
    .line 27
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 28
    .line 29
    sub-int/2addr p0, v0

    .line 30
    invoke-static {v1, v0, p0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object p0

    .line 35
    :catch_0
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public ttokenGenValue()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->hasMoreChars()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Landroid/gov/nist/core/StringTokenizer;->isAlphaDigit(C)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 v2, 0x27

    .line 26
    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    const/16 v2, 0x3a

    .line 30
    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    const/16 v2, 0x5b

    .line 34
    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    const/16 v2, 0x2a

    .line 38
    .line 39
    if-eq v1, v2, :cond_1

    .line 40
    .line 41
    const/16 v2, 0x2b

    .line 42
    .line 43
    if-eq v1, v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0x3f

    .line 46
    .line 47
    if-eq v1, v2, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x40

    .line 50
    .line 51
    if-eq v1, v2, :cond_1

    .line 52
    .line 53
    packed-switch v1, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    packed-switch v1, :pswitch_data_1

    .line 57
    .line 58
    .line 59
    packed-switch v1, :pswitch_data_2

    .line 60
    .line 61
    .line 62
    packed-switch v1, :pswitch_data_3

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :pswitch_0
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    :goto_1
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 71
    .line 72
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 73
    .line 74
    sub-int/2addr p0, v0

    .line 75
    invoke-static {v1, v0, p0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    return-object p0

    .line 80
    :catch_0
    const/4 p0, 0x0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    :pswitch_data_1
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :pswitch_data_2
    .packed-switch 0x5d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    :pswitch_data_3
    .packed-switch 0x7b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public ttokenNoWhiteSpace()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->hasMoreChars()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x20

    .line 15
    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v2, 0x9

    .line 23
    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 v1, 0x1

    .line 28
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 33
    .line 34
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 35
    .line 36
    sub-int/2addr p0, v0

    .line 37
    invoke-static {v1, v0, p0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-object p0

    .line 42
    :catch_0
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public ttokenSafe()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->hasMoreChars()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Landroid/gov/nist/core/StringTokenizer;->isAlphaDigit(C)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 v2, 0x27

    .line 26
    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    const/16 v2, 0x5b

    .line 30
    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    const/16 v2, 0x2a

    .line 34
    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    const/16 v2, 0x2b

    .line 38
    .line 39
    if-eq v1, v2, :cond_1

    .line 40
    .line 41
    const/16 v2, 0x3a

    .line 42
    .line 43
    if-eq v1, v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0x3b

    .line 46
    .line 47
    if-eq v1, v2, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x3f

    .line 50
    .line 51
    if-eq v1, v2, :cond_1

    .line 52
    .line 53
    const/16 v2, 0x40

    .line 54
    .line 55
    if-eq v1, v2, :cond_1

    .line 56
    .line 57
    packed-switch v1, :pswitch_data_0

    .line 58
    .line 59
    .line 60
    packed-switch v1, :pswitch_data_1

    .line 61
    .line 62
    .line 63
    packed-switch v1, :pswitch_data_2

    .line 64
    .line 65
    .line 66
    packed-switch v1, :pswitch_data_3

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    :pswitch_0
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    :goto_1
    iget-object v1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 75
    .line 76
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 77
    .line 78
    sub-int/2addr p0, v0

    .line 79
    invoke-static {v1, v0, p0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    return-object p0

    .line 84
    :catch_0
    const/4 p0, 0x0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :pswitch_data_1
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    :pswitch_data_2
    .packed-switch 0x5d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    :pswitch_data_3
    .packed-switch 0x7b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
