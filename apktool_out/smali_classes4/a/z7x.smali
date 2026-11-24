.class public final La/z7x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xz40;

.field public final b:La/pz40;

.field public c:J

.field public final d:La/pz40;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/xz40;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [La/x7x;

    .line 9
    .line 10
    invoke-direct {v0, v1}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/z7x;->a:La/xz40;

    .line 14
    .line 15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/z7x;->b:La/pz40;

    .line 22
    .line 23
    const-wide/high16 v0, -0x8000000000000000L

    .line 24
    .line 25
    iput-wide v0, p0, La/z7x;->c:J

    .line 26
    .line 27
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/z7x;->d:La/pz40;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(ILa/fet;)V
    .locals 6

    .line 1
    const v0, -0x12f4f699

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p1

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v4

    .line 27
    :goto_1
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_7

    .line 33
    .line 34
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x0

    .line 39
    sget-object v2, La/ukd;->a:La/cl5;

    .line 40
    .line 41
    if-ne v0, v2, :cond_2

    .line 42
    .line 43
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    check-cast v0, La/pz40;

    .line 51
    .line 52
    iget-object v3, p0, La/z7x;->d:La/pz40;

    .line 53
    .line 54
    check-cast v3, La/hgk0;

    .line 55
    .line 56
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_4

    .line 67
    .line 68
    iget-object v3, p0, La/z7x;->b:La/pz40;

    .line 69
    .line 70
    check-cast v3, La/hgk0;

    .line 71
    .line 72
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const v0, -0x88cf405

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    :goto_2
    const v3, -0x8a21ce8

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v3}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    if-nez v3, :cond_5

    .line 110
    .line 111
    if-ne v5, v2, :cond_6

    .line 112
    .line 113
    :cond_5
    new-instance v5, La/o3s;

    .line 114
    .line 115
    const/16 v2, 0xd

    .line 116
    .line 117
    invoke-direct {v5, v0, p0, v1, v2}, La/o3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 124
    .line 125
    invoke-static {p2, p0, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 133
    .line 134
    .line 135
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-eqz p2, :cond_8

    .line 140
    .line 141
    new-instance v0, La/xxv;

    .line 142
    .line 143
    const/16 v1, 0x10

    .line 144
    .line 145
    invoke-direct {v0, p0, p1, v1}, La/xxv;-><init>(Ljava/lang/Object;IB)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 149
    .line 150
    :cond_8
    return-void
.end method
