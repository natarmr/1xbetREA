.class public final synthetic La/qib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/ctf0;


# direct methods
.method public synthetic constructor <init>(BLa/pru;La/ctf0;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/qib;->a:B

    iput-object p2, p0, La/qib;->b:La/pru;

    iput-object p3, p0, La/qib;->c:La/ctf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/ctf0;La/pru;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/qib;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qib;->c:La/ctf0;

    iput-object p2, p0, La/qib;->b:La/pru;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/qib;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/qib;->b:La/pru;

    .line 6
    .line 7
    iget-object p0, p0, La/qib;->c:La/ctf0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/bmr0;

    .line 13
    .line 14
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v2, v2, La/sff0;->a:La/gx7;

    .line 19
    .line 20
    iget-object v2, v2, La/gx7;->f:Ljava/lang/String;

    .line 21
    .line 22
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 27
    .line 28
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const v2, 0x7f130421

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object v1, La/iun;->a:La/iun;

    .line 40
    .line 41
    invoke-direct {v0, p0, v1}, La/bmr0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_0
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v3, v0, La/sff0;->a:La/gx7;

    .line 50
    .line 51
    iget-boolean v4, v3, La/gx7;->e:Z

    .line 52
    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    new-instance v4, La/i2f;

    .line 56
    .line 57
    new-array v5, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 60
    .line 61
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const v6, 0x7f130f4a

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v4, p0}, La/i2f;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance p0, La/j2f;

    .line 76
    .line 77
    iget-object v5, v3, La/gx7;->f:Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct {p0, v5}, La/j2f;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 v5, 0x2

    .line 83
    new-array v5, v5, [La/k2f;

    .line 84
    .line 85
    aput-object v4, v5, v2

    .line 86
    .line 87
    aput-object p0, v5, v1

    .line 88
    .line 89
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :goto_0
    move-object v10, p0

    .line 94
    goto :goto_1

    .line 95
    :cond_0
    sget-object p0, La/iun;->a:La/iun;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_1
    iget-boolean v7, v3, La/gx7;->j:Z

    .line 99
    .line 100
    iget-object p0, v0, La/sff0;->g:La/mum0;

    .line 101
    .line 102
    iget-object v12, p0, La/mum0;->x:La/zvh0;

    .line 103
    .line 104
    iget-object p0, v3, La/gx7;->b:La/q57;

    .line 105
    .line 106
    iget-boolean v13, p0, La/q57;->h:Z

    .line 107
    .line 108
    iget-boolean v14, v0, La/sff0;->J1:Z

    .line 109
    .line 110
    new-instance v4, La/l2f;

    .line 111
    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const-string v5, ""

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    invoke-direct/range {v4 .. v14}, La/l2f;-><init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;ILa/zvh0;ZZ)V

    .line 119
    .line 120
    .line 121
    return-object v4

    .line 122
    :pswitch_1
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v0, v0, La/sff0;->Z1:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_1

    .line 133
    .line 134
    new-array v0, v2, [Ljava/lang/Object;

    .line 135
    .line 136
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 137
    .line 138
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const v1, 0x7f130ea4

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :cond_1
    move-object v7, v0

    .line 150
    new-instance v1, La/kib;

    .line 151
    .line 152
    sget-object v4, La/vhb;->a:La/vhb;

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v6, 0x1

    .line 156
    const/4 v2, 0x1

    .line 157
    const/4 v3, 0x1

    .line 158
    invoke-direct/range {v1 .. v7}, La/kib;-><init>(ZZLa/vhb;ZZLjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
