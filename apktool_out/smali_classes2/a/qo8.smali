.class public final La/qo8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/qo8;->a:B

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-array p1, p1, [La/vbs0;

    iput-object p1, p0, La/qo8;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 53
    iput-boolean p1, p0, La/qo8;->c:Z

    return-void
.end method

.method public constructor <init>(La/e0l0;)V
    .locals 3

    const/4 v0, 0x6

    iput-byte v0, p0, La/qo8;->a:B

    .line 40
    sget-object v0, La/wub;->b:La/wub;

    const v1, 0x7fffffff

    const/4 v2, 0x0

    .line 41
    invoke-direct {p0, p1, v2, v0, v1}, La/qo8;-><init>(La/e0l0;ZLa/uub;I)V

    return-void
.end method

.method public constructor <init>(La/e0l0;ZLa/uub;I)V
    .locals 1

    const/4 v0, 0x6

    iput-byte v0, p0, La/qo8;->a:B

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/qo8;->e:Ljava/lang/Object;

    .line 37
    iput-boolean p2, p0, La/qo8;->c:Z

    .line 38
    iput-object p3, p0, La/qo8;->d:Ljava/lang/Object;

    .line 39
    iput p4, p0, La/qo8;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/ax2;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/qo8;->a:B

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p2, p0, La/qo8;->d:Ljava/lang/Object;

    const/4 p2, 0x0

    .line 56
    iput p2, p0, La/qo8;->b:I

    .line 57
    new-instance p2, Landroid/view/GestureDetector;

    .line 58
    new-instance v0, La/i7x;

    invoke-direct {v0, p0}, La/i7x;-><init>(La/qo8;)V

    .line 59
    invoke-direct {p2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, La/qo8;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/qo8;->a:B

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qo8;->e:Ljava/lang/Object;

    .line 50
    new-instance p1, La/mx2;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, La/mx2;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/qo8;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/qo8;->a:B

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qo8;->e:Ljava/lang/Object;

    .line 48
    new-instance p1, La/apj0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, La/apj0;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/qo8;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZI)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/qo8;->a:B

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, La/qo8;->d:Ljava/lang/Object;

    .line 44
    iput-boolean p3, p0, La/qo8;->c:Z

    .line 45
    new-instance p3, La/rgn;

    invoke-direct {p3, p1, p2}, La/rgn;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    iput-object p3, p0, La/qo8;->e:Ljava/lang/Object;

    .line 46
    iput p4, p0, La/qo8;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/qo8;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/qo8;->d:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/dhf;

    .line 17
    .line 18
    iput-object v0, p0, La/qo8;->e:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x1

    .line 25
    if-le v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    iput-boolean v1, p0, La/qo8;->c:Z

    .line 30
    .line 31
    invoke-static {p1}, La/q3d;->i(Ljava/util/List;)I

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static a([[[La/rg40;ILa/rg40;)V
    .locals 3

    .line 1
    iget v0, p2, La/rg40;->d:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    aget-object p0, p0, p1

    .line 5
    .line 6
    iget p1, p2, La/rg40;->c:I

    .line 7
    .line 8
    aget-object p0, p0, p1

    .line 9
    .line 10
    iget-object p1, p2, La/rg40;->a:La/hm40;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v2, :cond_3

    .line 19
    .line 20
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x6

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "Illegal mode "

    .line 31
    .line 32
    invoke-static {p1, p0}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const/4 v1, 0x3

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v1, v2

    .line 39
    :cond_3
    :goto_0
    aget-object p1, p0, v1

    .line 40
    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    iget p1, p1, La/rg40;->f:I

    .line 44
    .line 45
    iget v0, p2, La/rg40;->f:I

    .line 46
    .line 47
    if-le p1, v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    return-void

    .line 51
    :cond_5
    :goto_1
    aput-object p2, p0, v1

    .line 52
    .line 53
    return-void
.end method

.method public static c(La/hm40;C)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq p0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq p0, v1, :cond_4

    .line 13
    .line 14
    const/4 v0, 0x6

    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, La/awn;->b(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    sget-object p0, La/awn;->a:[I

    .line 28
    .line 29
    const/16 v1, 0x60

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    if-ge p1, v1, :cond_2

    .line 33
    .line 34
    aget p0, p0, p1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move p0, v2

    .line 38
    :goto_0
    if-eq p0, v2, :cond_5

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/16 p0, 0x30

    .line 42
    .line 43
    if-lt p1, p0, :cond_5

    .line 44
    .line 45
    const/16 p0, 0x39

    .line 46
    .line 47
    if-gt p1, p0, :cond_5

    .line 48
    .line 49
    :cond_4
    :goto_1
    return v0

    .line 50
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public static f(I)La/ubu0;
    .locals 1

    .line 1
    invoke-static {p0}, La/hne;->E(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/16 p0, 0x28

    .line 11
    .line 12
    invoke-static {p0}, La/ubu0;->c(I)La/ubu0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 p0, 0x1a

    .line 18
    .line 19
    invoke-static {p0}, La/ubu0;->c(I)La/ubu0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    const/16 p0, 0x9

    .line 25
    .line 26
    invoke-static {p0}, La/ubu0;->c(I)La/ubu0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static g(Ljava/lang/String;)La/qo8;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    const-string v2, "The separator may not be the empty string."

    .line 8
    .line 9
    invoke-static {v2, v0}, La/x0x;->z(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    new-instance v1, La/vub;

    .line 24
    .line 25
    invoke-direct {v1, p0}, La/vub;-><init>(C)V

    .line 26
    .line 27
    .line 28
    new-instance p0, La/qo8;

    .line 29
    .line 30
    new-instance v2, La/b0l0;

    .line 31
    .line 32
    invoke-direct {v2, v1, v0}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v2}, La/qo8;-><init>(La/e0l0;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    new-instance v0, La/qo8;

    .line 40
    .line 41
    new-instance v1, La/d9v;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {v1, p0, v2}, La/d9v;-><init>(Ljava/lang/String;B)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1}, La/qo8;-><init>(La/e0l0;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method


# virtual methods
.method public b(La/ubu0;[[[La/rg40;ILa/rg40;)V
    .locals 12

    .line 1
    move v3, p3

    .line 2
    iget-object v0, p0, La/qo8;->d:Ljava/lang/Object;

    .line 3
    .line 4
    move-object v8, v0

    .line 5
    check-cast v8, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, La/qo8;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/rgn;

    .line 10
    .line 11
    iget-object v9, v0, La/rgn;->a:[Ljava/nio/charset/CharsetEncoder;

    .line 12
    .line 13
    array-length v2, v9

    .line 14
    iget v0, v0, La/rgn;->b:I

    .line 15
    .line 16
    const-string v10, ""

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    aget-object v5, v9, v0

    .line 25
    .line 26
    new-instance v6, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v5, v4}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    add-int/lit8 v2, v0, 0x1

    .line 45
    .line 46
    :goto_0
    move v11, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    move v4, v0

    .line 51
    :goto_2
    if-ge v4, v11, :cond_2

    .line 52
    .line 53
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    aget-object v2, v9, v4

    .line 58
    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v2, v0}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    new-instance v0, La/rg40;

    .line 78
    .line 79
    sget-object v2, La/hm40;->g:La/hm40;

    .line 80
    .line 81
    const/4 v5, 0x1

    .line 82
    move-object v1, p0

    .line 83
    move-object v7, p1

    .line 84
    move-object/from16 v6, p4

    .line 85
    .line 86
    invoke-direct/range {v0 .. v7}, La/rg40;-><init>(La/qo8;La/hm40;IIILa/rg40;La/ubu0;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p2, p3, v0}, La/qo8;->a([[[La/rg40;ILa/rg40;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    sget-object v2, La/hm40;->i:La/hm40;

    .line 100
    .line 101
    invoke-static {v2, v0}, La/qo8;->c(La/hm40;C)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    new-instance v0, La/rg40;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x1

    .line 111
    move-object v1, p0

    .line 112
    move-object v7, p1

    .line 113
    move-object/from16 v6, p4

    .line 114
    .line 115
    invoke-direct/range {v0 .. v7}, La/rg40;-><init>(La/qo8;La/hm40;IIILa/rg40;La/ubu0;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p2, p3, v0}, La/qo8;->a([[[La/rg40;ILa/rg40;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    sget-object v2, La/hm40;->e:La/hm40;

    .line 130
    .line 131
    invoke-static {v2, v0}, La/qo8;->c(La/hm40;C)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    const/4 v10, 0x2

    .line 136
    const/4 v11, 0x1

    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    new-instance v0, La/rg40;

    .line 140
    .line 141
    add-int/lit8 v1, v3, 0x1

    .line 142
    .line 143
    if-ge v1, v9, :cond_5

    .line 144
    .line 145
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-static {v2, v1}, La/qo8;->c(La/hm40;C)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_4

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    move v5, v10

    .line 157
    goto :goto_4

    .line 158
    :cond_5
    :goto_3
    move v5, v11

    .line 159
    :goto_4
    const/4 v4, 0x0

    .line 160
    move-object v1, p0

    .line 161
    move-object v7, p1

    .line 162
    move-object/from16 v6, p4

    .line 163
    .line 164
    invoke-direct/range {v0 .. v7}, La/rg40;-><init>(La/qo8;La/hm40;IIILa/rg40;La/ubu0;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p2, p3, v0}, La/qo8;->a([[[La/rg40;ILa/rg40;)V

    .line 168
    .line 169
    .line 170
    :cond_6
    invoke-virtual {v8, p3}, Ljava/lang/String;->charAt(I)C

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    sget-object v2, La/hm40;->d:La/hm40;

    .line 175
    .line 176
    invoke-static {v2, v0}, La/qo8;->c(La/hm40;C)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_b

    .line 181
    .line 182
    new-instance v0, La/rg40;

    .line 183
    .line 184
    add-int/lit8 v1, v3, 0x1

    .line 185
    .line 186
    if-ge v1, v9, :cond_a

    .line 187
    .line 188
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-static {v2, v1}, La/qo8;->c(La/hm40;C)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_7

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_7
    add-int/lit8 v1, v3, 0x2

    .line 200
    .line 201
    if-ge v1, v9, :cond_9

    .line 202
    .line 203
    invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-static {v2, v1}, La/qo8;->c(La/hm40;C)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-nez v1, :cond_8

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_8
    const/4 v10, 0x3

    .line 215
    :cond_9
    :goto_5
    move v5, v10

    .line 216
    goto :goto_7

    .line 217
    :cond_a
    :goto_6
    move v5, v11

    .line 218
    :goto_7
    const/4 v4, 0x0

    .line 219
    move-object v1, p0

    .line 220
    move-object v7, p1

    .line 221
    move-object/from16 v6, p4

    .line 222
    .line 223
    invoke-direct/range {v0 .. v7}, La/rg40;-><init>(La/qo8;La/hm40;IIILa/rg40;La/ubu0;)V

    .line 224
    .line 225
    .line 226
    invoke-static {p2, p3, v0}, La/qo8;->a([[[La/rg40;ILa/rg40;)V

    .line 227
    .line 228
    .line 229
    :cond_b
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/qo8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/qo8;->d:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/qo8;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 12
    .line 13
    iget-object v3, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput p1, p0, La/qo8;->b:I

    .line 25
    .line 26
    iget-boolean p1, p0, La/qo8;->c:Z

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    iget-object p1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroid/view/View;

    .line 37
    .line 38
    check-cast v2, La/apj0;

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    iput-boolean v1, p0, La/qo8;->c:Z

    .line 44
    .line 45
    :cond_1
    :goto_0
    return-void

    .line 46
    :pswitch_0
    iget-object v0, p0, La/qo8;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 49
    .line 50
    iget-object v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iput p1, p0, La/qo8;->b:I

    .line 62
    .line 63
    iget-boolean p1, p0, La/qo8;->c:Z

    .line 64
    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    iget-object p1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Landroid/view/View;

    .line 74
    .line 75
    check-cast v2, La/mx2;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    iput-boolean v1, p0, La/qo8;->c:Z

    .line 81
    .line 82
    :cond_3
    :goto_1
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(La/ubu0;)La/ouu;
    .locals 12

    .line 1
    iget-object v0, p0, La/qo8;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iget-object v3, p0, La/qo8;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, La/rgn;

    .line 14
    .line 15
    iget-object v3, v3, La/rgn;->a:[Ljava/nio/charset/CharsetEncoder;

    .line 16
    .line 17
    array-length v4, v3

    .line 18
    const/4 v5, 0x3

    .line 19
    new-array v5, v5, [I

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v7, 0x4

    .line 23
    aput v7, v5, v6

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    aput v4, v5, v6

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    aput v2, v5, v4

    .line 30
    .line 31
    const-class v2, La/rg40;

    .line 32
    .line 33
    invoke-static {v2, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, [[[La/rg40;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-virtual {p0, p1, v2, v4, v5}, La/qo8;->b(La/ubu0;[[[La/rg40;ILa/rg40;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    if-gt v6, v1, :cond_3

    .line 44
    .line 45
    move v5, v4

    .line 46
    :goto_1
    array-length v8, v3

    .line 47
    if-ge v5, v8, :cond_2

    .line 48
    .line 49
    move v8, v4

    .line 50
    :goto_2
    if-ge v8, v7, :cond_1

    .line 51
    .line 52
    aget-object v9, v2, v6

    .line 53
    .line 54
    aget-object v9, v9, v5

    .line 55
    .line 56
    aget-object v9, v9, v8

    .line 57
    .line 58
    if-eqz v9, :cond_0

    .line 59
    .line 60
    if-ge v6, v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0, p1, v2, v6, v9}, La/qo8;->b(La/ubu0;[[[La/rg40;ILa/rg40;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v5, -0x1

    .line 75
    const v6, 0x7fffffff

    .line 76
    .line 77
    .line 78
    move v9, v4

    .line 79
    move v8, v6

    .line 80
    move v6, v5

    .line 81
    :goto_3
    array-length v10, v3

    .line 82
    if-ge v9, v10, :cond_6

    .line 83
    .line 84
    move v10, v4

    .line 85
    :goto_4
    if-ge v10, v7, :cond_5

    .line 86
    .line 87
    aget-object v11, v2, v1

    .line 88
    .line 89
    aget-object v11, v11, v9

    .line 90
    .line 91
    aget-object v11, v11, v10

    .line 92
    .line 93
    if-eqz v11, :cond_4

    .line 94
    .line 95
    iget v11, v11, La/rg40;->f:I

    .line 96
    .line 97
    if-ge v11, v8, :cond_4

    .line 98
    .line 99
    move v5, v9

    .line 100
    move v6, v10

    .line 101
    move v8, v11

    .line 102
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    if-ltz v5, :cond_7

    .line 109
    .line 110
    new-instance v0, La/ouu;

    .line 111
    .line 112
    aget-object v1, v2, v1

    .line 113
    .line 114
    aget-object v1, v1, v5

    .line 115
    .line 116
    aget-object v1, v1, v6

    .line 117
    .line 118
    invoke-direct {v0, p0, p1, v1}, La/ouu;-><init>(La/qo8;La/ubu0;La/rg40;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_7
    new-instance p0, La/lrv0;

    .line 123
    .line 124
    const-string p1, "Internal error: failed to encode \""

    .line 125
    .line 126
    const-string v1, "\""

    .line 127
    .line 128
    invoke-static {p1, v0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0
.end method

.method public h(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/qo8;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/e0l0;

    .line 7
    .line 8
    invoke-interface {v0, p0, p1}, La/e0l0;->d(La/qo8;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    move-object v0, p0

    .line 18
    check-cast v0, La/c0l0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/c0l0;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, La/c0l0;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
