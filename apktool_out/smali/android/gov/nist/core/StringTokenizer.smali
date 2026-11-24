.class public Landroid/gov/nist/core/StringTokenizer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected buffer:[C

.field protected bufferLen:I

.field protected ptr:I

.field protected savedPtr:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Landroid/gov/nist/core/StringTokenizer;->bufferLen:I

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 18
    .line 19
    return-void
.end method

.method public static getSDPFieldName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    const-string v1, "="

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    return-object v0
.end method

.method public static isAlpha(C)Z
    .locals 3

    .line 1
    const/16 v0, 0x7f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-gt p0, v0, :cond_3

    .line 6
    .line 7
    const/16 v0, 0x61

    .line 8
    .line 9
    if-lt p0, v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x7a

    .line 12
    .line 13
    if-le p0, v0, :cond_1

    .line 14
    .line 15
    :cond_0
    const/16 v0, 0x41

    .line 16
    .line 17
    if-lt p0, v0, :cond_2

    .line 18
    .line 19
    const/16 v0, 0x5a

    .line 20
    .line 21
    if-gt p0, v0, :cond_2

    .line 22
    .line 23
    :cond_1
    return v2

    .line 24
    :cond_2
    return v1

    .line 25
    :cond_3
    invoke-static {p0}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_5

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    return v1

    .line 39
    :cond_5
    :goto_0
    return v2
.end method

.method public static isAlphaDigit(C)Z
    .locals 3

    .line 1
    const/16 v0, 0x7f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-gt p0, v0, :cond_4

    .line 6
    .line 7
    const/16 v0, 0x61

    .line 8
    .line 9
    if-lt p0, v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x7a

    .line 12
    .line 13
    if-le p0, v0, :cond_2

    .line 14
    .line 15
    :cond_0
    const/16 v0, 0x41

    .line 16
    .line 17
    if-lt p0, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x5a

    .line 20
    .line 21
    if-le p0, v0, :cond_2

    .line 22
    .line 23
    :cond_1
    const/16 v0, 0x39

    .line 24
    .line 25
    if-gt p0, v0, :cond_3

    .line 26
    .line 27
    const/16 v0, 0x30

    .line 28
    .line 29
    if-lt p0, v0, :cond_3

    .line 30
    .line 31
    :cond_2
    return v2

    .line 32
    :cond_3
    return v1

    .line 33
    :cond_4
    invoke-static {p0}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_6

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_6

    .line 44
    .line 45
    invoke-static {p0}, Ljava/lang/Character;->isDigit(C)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    return v1

    .line 53
    :cond_6
    :goto_0
    return v2
.end method

.method public static isDigit(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x7f

    .line 2
    .line 3
    if-gt p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x39

    .line 6
    .line 7
    if-gt p0, v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x30

    .line 10
    .line 11
    if-lt p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->isDigit(C)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public static isHexDigit(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x41

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x46

    .line 6
    .line 7
    if-le p0, v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x61

    .line 10
    .line 11
    if-lt p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x66

    .line 14
    .line 15
    if-le p0, v0, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-static {p0}, Landroid/gov/nist/core/StringTokenizer;->isDigit(C)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    :cond_2
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_3
    const/4 p0, 0x0

    .line 26
    return p0
.end method


# virtual methods
.method public consume()V
    .locals 1

    .line 7
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->savedPtr:I

    iput v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    return-void
.end method

.method public consume(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 5
    .line 6
    return-void
.end method

.method public getLine()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    :goto_0
    iget v1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 4
    .line 5
    iget v2, p0, Landroid/gov/nist/core/StringTokenizer;->bufferLen:I

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v4, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 12
    .line 13
    aget-char v4, v4, v1

    .line 14
    .line 15
    if-eq v4, v3, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    iput v1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-ge v1, v2, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 25
    .line 26
    aget-char v2, v2, v1

    .line 27
    .line 28
    if-ne v2, v3, :cond_1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    iput v1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 33
    .line 34
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 35
    .line 36
    sub-int/2addr v1, v0

    .line 37
    invoke-static {p0, v0, v1}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public getLines()Ljava/util/Vector;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Vector<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/Vector;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->hasMoreChars()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->getLine()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0
.end method

.method public getNextChar()C
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    iget v1, p0, Landroid/gov/nist/core/StringTokenizer;->bufferLen:I

    .line 4
    .line 5
    iget-object v2, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x1

    .line 10
    .line 11
    iput v1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 12
    .line 13
    aget-char p0, v2, v0

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " getNextChar: End of buffer"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 34
    .line 35
    invoke-static {p0, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public getNextToken(C)Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ne v2, p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 11
    .line 12
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 13
    .line 14
    sub-int/2addr p0, v0

    .line 15
    invoke-static {p1, v0, p0}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    if-eqz v2, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-string p0, "EOL reached"

    .line 28
    .line 29
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public hasMoreChars()Z
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->bufferLen:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public lookAhead()C
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    move-result p0

    return p0
.end method

.method public lookAhead(I)C
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 2
    .line 3
    iget p0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 4
    .line 5
    add-int/2addr p0, p1

    .line 6
    aget-char p0, v0, p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    return p0

    .line 9
    :catch_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public nextToken()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    :cond_0
    iget v1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 4
    .line 5
    iget v2, p0, Landroid/gov/nist/core/StringTokenizer;->bufferLen:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    iget-object v2, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 10
    .line 11
    aget-char v2, v2, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    iput v1, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 16
    .line 17
    const/16 v3, 0xa

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/core/StringTokenizer;->buffer:[C

    .line 22
    .line 23
    sub-int/2addr v1, v0

    .line 24
    invoke-static {p0, v0, v1}, Ljava/lang/String;->valueOf([CII)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public peekLine()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/StringTokenizer;->getLine()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iput v0, p0, Landroid/gov/nist/core/StringTokenizer;->ptr:I

    .line 8
    .line 9
    return-object v1
.end method
