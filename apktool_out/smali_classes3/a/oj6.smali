.class public final synthetic La/oj6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r9u;

.field public final synthetic c:La/pru;


# direct methods
.method public synthetic constructor <init>(La/pru;La/art;La/r9u;)V
    .locals 0

    .line 2
    const/4 p2, 0x2

    iput-byte p2, p0, La/oj6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/oj6;->c:La/pru;

    iput-object p3, p0, La/oj6;->b:La/r9u;

    return-void
.end method

.method public synthetic constructor <init>(La/pru;La/r9u;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput-byte v0, p0, La/oj6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/oj6;->c:La/pru;

    iput-object p2, p0, La/oj6;->b:La/r9u;

    return-void
.end method

.method public synthetic constructor <init>(La/r9u;La/pru;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/oj6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/oj6;->b:La/r9u;

    iput-object p2, p0, La/oj6;->c:La/pru;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oj6;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/oj6;->b:La/r9u;

    .line 6
    .line 7
    iget-object v0, v0, La/oj6;->c:La/pru;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v5, v0, La/sff0;->h1:La/udl0;

    .line 17
    .line 18
    invoke-static {v5}, La/ufx;->N(La/udl0;)La/t730;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, La/art;->d(La/t730;)La/aw20;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    new-instance v3, La/y330;

    .line 27
    .line 28
    sget-object v8, La/iun;->a:La/iun;

    .line 29
    .line 30
    sget-object v0, La/ygp;->t:La/ygp;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v1, v2, La/r9u;->a:La/j1q0;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    sget-object v0, La/ygp;->o1:La/ygp;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    const/4 v4, 0x1

    .line 53
    move-object v7, v6

    .line 54
    invoke-direct/range {v3 .. v10}, La/y330;-><init>(ZLa/udl0;La/aw20;La/aw20;Ljava/util/List;ZZ)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :pswitch_0
    new-instance v4, La/or6;

    .line 59
    .line 60
    sget-object v5, La/iun;->a:La/iun;

    .line 61
    .line 62
    sget-object v1, La/ygp;->t:La/ygp;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 73
    .line 74
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 83
    .line 84
    iget-object v12, v0, La/mum0;->C:La/bq6;

    .line 85
    .line 86
    sget-object v13, La/gio;->d:La/gio;

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x1

    .line 91
    const/4 v11, 0x0

    .line 92
    move-object v6, v5

    .line 93
    invoke-direct/range {v4 .. v13}, La/or6;-><init>(Ljava/util/List;Ljava/util/List;IZZZZLa/bq6;La/gio;)V

    .line 94
    .line 95
    .line 96
    return-object v4

    .line 97
    :pswitch_1
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v3, La/hj6;

    .line 102
    .line 103
    sget-object v7, La/iun;->a:La/iun;

    .line 104
    .line 105
    iget-object v11, v0, La/sff0;->I1:La/oxk0;

    .line 106
    .line 107
    sget-object v1, La/ygp;->t:La/ygp;

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 118
    .line 119
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    iget-boolean v14, v0, La/sff0;->R1:Z

    .line 124
    .line 125
    iget-boolean v15, v0, La/sff0;->J1:Z

    .line 126
    .line 127
    iget-boolean v0, v0, La/sff0;->O1:Z

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    const/4 v5, 0x0

    .line 131
    const/4 v6, 0x0

    .line 132
    const/4 v8, 0x0

    .line 133
    const-string v9, ""

    .line 134
    .line 135
    const/4 v10, 0x1

    .line 136
    move-object v13, v7

    .line 137
    move/from16 v16, v0

    .line 138
    .line 139
    invoke-direct/range {v3 .. v16}, La/hj6;-><init>(ZLa/ji6;La/l9s;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;ZLa/oxk0;ZLjava/util/List;ZZZ)V

    .line 140
    .line 141
    .line 142
    return-object v3

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
