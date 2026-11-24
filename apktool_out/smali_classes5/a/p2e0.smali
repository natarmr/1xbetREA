.class public final synthetic La/p2e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;


# direct methods
.method public synthetic constructor <init>(La/pru;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/p2e0;->a:B

    iput-object p1, p0, La/p2e0;->b:La/pru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/pru;La/rqt;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput-byte p2, p0, La/p2e0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p2e0;->b:La/pru;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/p2e0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/p2e0;->b:La/pru;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    new-instance v0, La/yhr0;

    .line 15
    .line 16
    new-instance v2, La/lmr0;

    .line 17
    .line 18
    const-string v3, ""

    .line 19
    .line 20
    sget-object v4, La/ulr0;->c:La/ulr0;

    .line 21
    .line 22
    invoke-direct {v2, v1, v3, v4, v1}, La/lmr0;-><init>(ILjava/lang/String;La/ulr0;Z)V

    .line 23
    .line 24
    .line 25
    sget-object v3, La/lun;->a:La/lun;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p0, p0, La/sff0;->a:La/gx7;

    .line 35
    .line 36
    iget-object v4, p0, La/gx7;->f:Ljava/lang/String;

    .line 37
    .line 38
    const-wide/16 v9, 0x0

    .line 39
    .line 40
    const-string v11, ""

    .line 41
    .line 42
    sget-object v1, La/jhr0;->a:La/jhr0;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const-wide/16 v7, 0x0

    .line 47
    .line 48
    invoke-direct/range {v0 .. v11}, La/yhr0;-><init>(La/lhr0;La/lmr0;Ljava/util/Map;Ljava/lang/String;ZZJJLjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_1
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object v1, p0, La/sff0;->l:La/toc0;

    .line 62
    .line 63
    new-instance v0, La/s0i0;

    .line 64
    .line 65
    sget-object v3, La/y0b;->b:La/y0b;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v2, 0x0

    .line 70
    move-object v4, v3

    .line 71
    invoke-direct/range {v0 .. v6}, La/s0i0;-><init>(La/toc0;Ljava/lang/Long;La/y0b;La/y0b;ZZ)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v3, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-boolean v10, p0, La/sff0;->J1:Z

    .line 85
    .line 86
    new-instance v0, La/tzh0;

    .line 87
    .line 88
    const-wide/16 v6, 0x0

    .line 89
    .line 90
    const-wide/16 v8, 0x0

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    const/4 v2, 0x0

    .line 94
    const-wide/16 v4, 0x0

    .line 95
    .line 96
    invoke-direct/range {v0 .. v10}, La/tzh0;-><init>(La/new;La/edw;Ljava/util/List;JJJZ)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_4
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    new-instance v0, La/y7f0;

    .line 105
    .line 106
    sget-object v1, La/iun;->a:La/iun;

    .line 107
    .line 108
    iget-object v2, p0, La/sff0;->k:La/f3c0;

    .line 109
    .line 110
    invoke-static {v2}, La/rqt;->f(La/f3c0;)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-direct {v0, v1, v2, p0}, La/y7f0;-><init>(Ljava/util/List;Ljava/lang/Integer;La/sff0;)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_5
    sget-object v6, La/kgz;->b:La/kgz;

    .line 119
    .line 120
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    new-instance v3, La/o7e0;

    .line 125
    .line 126
    const/4 v8, 0x1

    .line 127
    sget-object v5, La/f7e0;->c:La/f7e0;

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    invoke-direct/range {v3 .. v8}, La/o7e0;-><init>(La/sff0;La/h7e0;La/kgz;La/j0g0;Z)V

    .line 131
    .line 132
    .line 133
    return-object v3

    .line 134
    :pswitch_6
    new-instance v0, La/t2e0;

    .line 135
    .line 136
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    iget-object p0, p0, La/sff0;->e:La/x6j0;

    .line 141
    .line 142
    iget-object p0, p0, La/x6j0;->d:Ljava/lang/String;

    .line 143
    .line 144
    invoke-direct {v0, p0, v1, v1}, La/t2e0;-><init>(Ljava/lang/String;IZ)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
