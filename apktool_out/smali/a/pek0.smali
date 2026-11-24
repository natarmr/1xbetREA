.class public final La/pek0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sek0;
.implements La/cqg;
.implements La/e8q0;
.implements La/kyr0;
.implements La/vgu0;
.implements La/l7w0;


# static fields
.field public static final a:La/pek0;

.field public static final b:La/pn20;

.field public static final c:La/pek0;

.field public static final d:La/pek0;

.field public static final e:La/pek0;

.field public static final f:La/pek0;

.field public static final g:La/pek0;

.field public static final h:La/pek0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/pek0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/pek0;->a:La/pek0;

    .line 7
    .line 8
    new-instance v0, La/pn20;

    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/pn20;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/pek0;->b:La/pn20;

    .line 16
    .line 17
    new-instance v0, La/pek0;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/pek0;->c:La/pek0;

    .line 23
    .line 24
    new-instance v0, La/pek0;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, La/pek0;->d:La/pek0;

    .line 30
    .line 31
    new-instance v0, La/pek0;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, La/pek0;->e:La/pek0;

    .line 37
    .line 38
    new-instance v0, La/pek0;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    sput-object v0, La/pek0;->f:La/pek0;

    .line 44
    .line 45
    new-instance v0, La/pek0;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, La/pek0;->g:La/pek0;

    .line 51
    .line 52
    new-instance v0, La/pek0;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, La/pek0;->h:La/pek0;

    .line 58
    .line 59
    return-void
.end method

.method public static n(Landroidx/fragment/app/e;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/a64;->l2:La/jdk0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v0, "AUTH_ENTRY_POINTS_DIALOG_TAG"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v1, La/a64;

    .line 19
    .line 20
    invoke-direct {v1}, La/a64;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/a64;->m2:[La/iiy;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    aget-object v2, v2, v3

    .line 27
    .line 28
    iget-object v3, v1, La/a64;->k2:La/cgx0;

    .line 29
    .line 30
    invoke-virtual {v3, v1, v2, p1}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static o(Ljava/lang/Object;)La/mgw0;
    .locals 2

    .line 1
    check-cast p0, La/mew0;

    .line 2
    .line 3
    iget-object v0, p0, La/mew0;->zzc:La/mgw0;

    .line 4
    .line 5
    sget-object v1, La/mgw0;->f:La/mgw0;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, La/mgw0;->a()La/mgw0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/mew0;->zzc:La/mgw0;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public static p(ILa/hu5;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget-object v0, p1, La/hu5;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/tdw0;

    .line 4
    .line 5
    iget v1, p1, La/hu5;->b:I

    .line 6
    .line 7
    ushr-int/lit8 v2, v1, 0x3

    .line 8
    .line 9
    and-int/lit8 v1, v1, 0x7

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x3

    .line 14
    if-eqz v1, :cond_b

    .line 15
    .line 16
    if-eq v1, v4, :cond_a

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    if-eq v1, v6, :cond_9

    .line 20
    .line 21
    const-string v6, "Protocol message end-group tag did not match expected tag."

    .line 22
    .line 23
    if-eq v1, v5, :cond_3

    .line 24
    .line 25
    const/4 v7, 0x4

    .line 26
    if-eq v1, v7, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x5

    .line 29
    if-ne v1, p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, p0}, La/hu5;->u0(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, La/tdw0;->H()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    shl-int/lit8 v0, v2, 0x3

    .line 39
    .line 40
    check-cast p2, La/mgw0;

    .line 41
    .line 42
    or-int/2addr p0, v0

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p2, p0, p1}, La/mgw0;->d(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return v4

    .line 51
    :cond_0
    invoke-static {}, La/itt0;->p()V

    .line 52
    .line 53
    .line 54
    return v3

    .line 55
    :cond_1
    if-eqz p0, :cond_2

    .line 56
    .line 57
    return v3

    .line 58
    :cond_2
    invoke-static {v6}, La/itt0;->x(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return v3

    .line 62
    :cond_3
    invoke-static {}, La/mgw0;->a()La/mgw0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    shl-int/lit8 v1, v2, 0x3

    .line 67
    .line 68
    add-int/2addr p0, v4

    .line 69
    const/16 v2, 0x64

    .line 70
    .line 71
    if-ge p0, v2, :cond_8

    .line 72
    .line 73
    :cond_4
    invoke-virtual {p1}, La/hu5;->F0()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const v7, 0x7fffffff

    .line 78
    .line 79
    .line 80
    if-eq v2, v7, :cond_5

    .line 81
    .line 82
    invoke-static {p0, p1, v0}, La/pek0;->p(ILa/hu5;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    :cond_5
    or-int/lit8 p0, v1, 0x4

    .line 89
    .line 90
    iget p1, p1, La/hu5;->b:I

    .line 91
    .line 92
    if-ne p0, p1, :cond_7

    .line 93
    .line 94
    iget-boolean p0, v0, La/mgw0;->e:Z

    .line 95
    .line 96
    if-eqz p0, :cond_6

    .line 97
    .line 98
    iput-boolean v3, v0, La/mgw0;->e:Z

    .line 99
    .line 100
    :cond_6
    check-cast p2, La/mgw0;

    .line 101
    .line 102
    or-int/lit8 p0, v1, 0x3

    .line 103
    .line 104
    invoke-virtual {p2, p0, v0}, La/mgw0;->d(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return v4

    .line 108
    :cond_7
    invoke-static {v6}, La/itt0;->x(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return v3

    .line 112
    :cond_8
    const-string p0, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    .line 113
    .line 114
    invoke-static {p0}, La/itt0;->x(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return v3

    .line 118
    :cond_9
    invoke-virtual {p1}, La/hu5;->b1()La/qdw0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    shl-int/lit8 p1, v2, 0x3

    .line 123
    .line 124
    check-cast p2, La/mgw0;

    .line 125
    .line 126
    or-int/2addr p1, v6

    .line 127
    invoke-virtual {p2, p1, p0}, La/mgw0;->d(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return v4

    .line 131
    :cond_a
    invoke-virtual {p1, v4}, La/hu5;->u0(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, La/tdw0;->G()J

    .line 135
    .line 136
    .line 137
    move-result-wide p0

    .line 138
    shl-int/lit8 v0, v2, 0x3

    .line 139
    .line 140
    check-cast p2, La/mgw0;

    .line 141
    .line 142
    or-int/2addr v0, v4

    .line 143
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p2, v0, p0}, La/mgw0;->d(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return v4

    .line 151
    :cond_b
    invoke-virtual {p1, v3}, La/hu5;->u0(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, La/tdw0;->D()J

    .line 155
    .line 156
    .line 157
    move-result-wide p0

    .line 158
    check-cast p2, La/mgw0;

    .line 159
    .line 160
    shl-int/lit8 v0, v2, 0x3

    .line 161
    .line 162
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p2, v0, p0}, La/mgw0;->d(ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return v4
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    const p0, 0x7f130855

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "2"

    .line 2
    .line 3
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "5"

    .line 2
    .line 3
    return-object p0
.end method

.method public d()I
    .locals 0

    .line 31
    const p0, 0x7f130854

    return p0
.end method

.method public d(La/x1;)Lkotlin/jvm/functions/Function0;
    .locals 3

    .line 1
    new-instance p0, La/sgu0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, p1, v0}, La/sgu0;-><init>(La/x1;B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, La/tgu0;

    .line 11
    .line 12
    invoke-direct {v0, p1}, La/tgu0;-><init>(La/x1;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, La/b8k0;->J(Landroid/view/View;)La/zva0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v1, v1, La/zva0;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v1, La/hot0;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v1, p1, p0, v0, v2}, La/hot0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method

.method public e()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "3"

    .line 2
    .line 3
    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "1"

    .line 2
    .line 3
    return-object p0
.end method

.method public g()F
    .locals 0

    .line 1
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 2
    .line 3
    return p0
.end method

.method public h()J
    .locals 2

    .line 1
    sget p0, La/y3d;->h:I

    .line 2
    .line 3
    sget-wide v0, La/y3d;->g:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public i()I
    .locals 0

    .line 1
    const p0, 0x7f130853

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public j()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "4"

    .line 2
    .line 3
    return-object p0
.end method

.method public k()I
    .locals 0

    .line 1
    const p0, 0x7f130851

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public l()La/t89;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public m()I
    .locals 0

    .line 1
    const p0, 0x7f130852

    .line 2
    .line 3
    .line 4
    return p0
.end method
