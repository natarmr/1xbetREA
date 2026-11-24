.class public Landroid/gov/nist/javax/sdp/fields/PreconditionFields;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final DIRECTION:[Ljava/lang/String;

.field public static final DIRECTION_NONE:I = 0x0

.field public static final DIRECTION_RECV:I = 0x2

.field public static final DIRECTION_SEND:I = 0x1

.field public static final DIRECTION_SENDRECV:I = 0x3

.field public static final PRECONDITION:[Ljava/lang/String;

.field public static final PRECONDITION_QOS:I = 0x0

.field public static final STATUS:[Ljava/lang/String;

.field public static final STATUS_E2E:I = 0x0

.field public static final STATUS_LOCAL:I = 0x1

.field public static final STATUS_REMOTE:I = 0x2

.field public static final STRENGTH:[Ljava/lang/String;

.field public static final STRENGTH_FAILURE:I = 0x1

.field public static final STRENGTH_MANDATORY:I = 0x4

.field public static final STRENGTH_NONE:I = 0x2

.field public static final STRENGTH_OPTIONAL:I = 0x3

.field public static final STRENGTH_UNKNOWN:I


# instance fields
.field protected preconditionAttributes:Ljava/util/Vector;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "optional"

    .line 2
    .line 3
    const-string v1, "mandatory"

    .line 4
    .line 5
    const-string v2, "unknown"

    .line 6
    .line 7
    const-string v3, "failure"

    .line 8
    .line 9
    const-string v4, "none"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->STRENGTH:[Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "recv"

    .line 18
    .line 19
    const-string v1, "sendrecv"

    .line 20
    .line 21
    const-string v2, "send"

    .line 22
    .line 23
    filled-new-array {v4, v2, v0, v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->DIRECTION:[Ljava/lang/String;

    .line 28
    .line 29
    const-string v0, "local"

    .line 30
    .line 31
    const-string v1, "remote"

    .line 32
    .line 33
    const-string v2, "e2e"

    .line 34
    .line 35
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->STATUS:[Ljava/lang/String;

    .line 40
    .line 41
    const-string v0, "qos"

    .line 42
    .line 43
    filled-new-array {v0}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->PRECONDITION:[Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Vector;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getPreconditionConfirmStatus()Ljava/util/Vector;
    .locals 6

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    new-instance v0, Ljava/util/Vector;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_2

    .line 20
    .line 21
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "conf"

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v0, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3
    return-object v0
.end method

.method public getPreconditionCurr(Ljava/lang/String;)Ljava/util/Vector;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/util/Vector;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v2, v3, :cond_3

    .line 22
    .line 23
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "curr"

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/4 v5, -0x1

    .line 57
    if-eq v4, v5, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_4

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_4
    return-object v1

    .line 73
    :cond_5
    const-string p0, "The status-type is null"

    .line 74
    .line 75
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method

.method public getPreconditionDes(Ljava/lang/String;)Ljava/util/Vector;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/util/Vector;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v2, v3, :cond_3

    .line 22
    .line 23
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "des"

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/4 v5, -0x1

    .line 57
    if-eq v4, v5, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_4

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_4
    return-object v1

    .line 73
    :cond_5
    const-string p0, "The status-type is null"

    .line 74
    .line 75
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method

.method public getPreconditionSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, -0x1

    .line 11
    return p0
.end method

.method public getPreconditions()Ljava/util/Vector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 2
    .line 3
    return-object p0
.end method

.method public setPreconditionConfirmStatus(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 157
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    if-eqz v0, :cond_0

    .line 159
    :try_start_0
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 160
    aget-object v0, p1, v0

    const/4 v1, 0x2

    aget-object p1, p1, v1

    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->setPreconditionConfirmStatus(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 161
    new-instance p1, La/wch0;

    const-string v0, "Error spliting the \"conf\" attribute into words"

    invoke-direct {p1, v0, p0}, La/wch0;-><init>(Ljava/lang/String;Ljava/lang/ArrayIndexOutOfBoundsException;)V

    throw p1

    .line 162
    :cond_0
    const-string p0, "The Precondition Attributes is null"

    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    return-void

    .line 163
    :cond_1
    const-string p0, "The Precondition \"conf\" attribute value is null"

    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    return-void
.end method

.method public setPreconditionConfirmStatus(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const-string v2, " "

    .line 27
    .line 28
    const-string v3, "qos "

    .line 29
    .line 30
    const-string v4, "conf"

    .line 31
    .line 32
    if-ge v0, v1, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    const/4 v6, -0x1

    .line 66
    if-eq v5, v6, :cond_1

    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-ne v5, v6, :cond_2

    .line 77
    .line 78
    new-instance v5, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v1, v5}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setValue(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v5, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 100
    .line 101
    invoke-virtual {v5, v1, v0}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    :goto_2
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-ne v0, v1, :cond_3

    .line 115
    .line 116
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 117
    .line 118
    invoke-static {v3, p1, v2, p2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {v0, v4, p1}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance p1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 126
    .line 127
    invoke-direct {p1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setAttribute(Landroid/gov/nist/core/NameValue;)V

    .line 131
    .line 132
    .line 133
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_3
    return-void

    .line 139
    :cond_4
    const-string p0, "Precondition Attributes is null"

    .line 140
    .line 141
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_5
    const-string p0, "The direction-tag is null"

    .line 146
    .line 147
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_6
    const-string p0, "The status-type is null"

    .line 152
    .line 153
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public setPreconditionCurr(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 146
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    if-eqz v0, :cond_0

    .line 147
    :try_start_0
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 148
    aget-object v0, p1, v0

    const/4 v1, 0x2

    aget-object p1, p1, v1

    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->setPreconditionCurr(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 149
    new-instance p1, La/wch0;

    const-string v0, "Error spliting the \"curr\" attribute into words"

    invoke-direct {p1, v0, p0}, La/wch0;-><init>(Ljava/lang/String;Ljava/lang/ArrayIndexOutOfBoundsException;)V

    throw p1

    .line 150
    :cond_0
    const-string p0, "The Precondition Attributes is null"

    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    return-void

    .line 151
    :cond_1
    const-string p0, "The Precondition \"curr\" attribute value is null"

    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    return-void
.end method

.method public setPreconditionCurr(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    if-eqz p2, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, " "

    .line 17
    .line 18
    const-string v3, "qos "

    .line 19
    .line 20
    const-string v4, "curr"

    .line 21
    .line 22
    if-ge v0, v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/4 v6, -0x1

    .line 56
    if-eq v5, v6, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ne v5, v6, :cond_2

    .line 67
    .line 68
    new-instance v4, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setValue(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 90
    .line 91
    invoke-virtual {v2, v1, v0}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    .line 92
    .line 93
    .line 94
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-ne v0, v1, :cond_3

    .line 104
    .line 105
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 106
    .line 107
    invoke-static {v3, p1, v2, p2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-direct {v0, v4, p1}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance p1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 115
    .line 116
    invoke-direct {p1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setAttribute(Landroid/gov/nist/core/NameValue;)V

    .line 120
    .line 121
    .line 122
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_3
    return-void

    .line 128
    :cond_4
    const-string p0, "Precondition Attributes is null"

    .line 129
    .line 130
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_5
    const-string p0, "The direction-tag is null"

    .line 135
    .line 136
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_6
    const-string p0, "The status-type is null"

    .line 141
    .line 142
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public setPreconditionDes(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 142
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    if-eqz v0, :cond_0

    .line 143
    :try_start_0
    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 144
    aget-object v0, p1, v0

    const/4 v1, 0x2

    aget-object v1, p1, v1

    const/4 v2, 0x3

    aget-object p1, p1, v2

    invoke-virtual {p0, v0, v1, p1}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->setPreconditionDes(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 145
    new-instance p1, La/wch0;

    const-string v0, "Error spliting the \"des\" attribute into words"

    invoke-direct {p1, v0, p0}, La/wch0;-><init>(Ljava/lang/String;Ljava/lang/ArrayIndexOutOfBoundsException;)V

    throw p1

    .line 146
    :cond_0
    const-string p0, "The Precondition Attributes is null"

    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    return-void

    .line 147
    :cond_1
    const-string p0, "The Precondition \"des\" attribute value is null"

    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    return-void
.end method

.method public setPreconditionDes(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    if-eqz p2, :cond_6

    .line 4
    .line 5
    if-eqz p3, :cond_5

    .line 6
    .line 7
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 19
    .line 20
    const-string v3, "qos "

    .line 21
    .line 22
    const-string v4, "des"

    .line 23
    .line 24
    const-string v5, " "

    .line 25
    .line 26
    if-ge v0, v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getValue()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/4 v4, -0x1

    .line 58
    if-eq v2, v4, :cond_1

    .line 59
    .line 60
    invoke-static {v3, p1, v5, p2, v5}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setValue(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 75
    .line 76
    invoke-virtual {v2, v1, v0}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-ne v0, v1, :cond_3

    .line 87
    .line 88
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 89
    .line 90
    invoke-static {v3, p1, v5, p2, v5}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {v0, v4, p1}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 105
    .line 106
    invoke-direct {p1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setAttribute(Landroid/gov/nist/core/NameValue;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void

    .line 118
    :cond_4
    const-string p0, "Precondition Attributes is null"

    .line 119
    .line 120
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_5
    const-string p0, "The direction-tag is null"

    .line 125
    .line 126
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_6
    const-string p0, "The status-type is null"

    .line 131
    .line 132
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_7
    const-string p0, "The strength-tag is null"

    .line 137
    .line 138
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public setPreconditions(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->preconditionAttributes:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Precondition attributes are null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
