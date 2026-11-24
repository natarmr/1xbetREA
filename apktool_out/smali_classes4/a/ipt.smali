.class public final La/ipt;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public synthetic k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ipt;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ipt;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ipt;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, La/ipt;->k:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, La/ipt;->l:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object v2, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, La/fqu0;

    .line 18
    .line 19
    new-instance v2, La/j0g0;

    .line 20
    .line 21
    invoke-direct {v2, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/j0g0;

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/j0g0;

    .line 30
    .line 31
    invoke-direct {v1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v2, v0, v1}, La/fqu0;-><init>(La/j0g0;La/j0g0;La/j0g0;)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/j0g0;

    .line 38
    .line 39
    invoke-direct {p0, p1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    iget-object v0, p0, La/ipt;->j:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, p0, La/ipt;->k:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p0, p0, La/ipt;->l:Ljava/lang/Object;

    .line 48
    .line 49
    sget-object v2, La/wne;->a:La/wne;

    .line 50
    .line 51
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, La/i3v;

    .line 55
    .line 56
    invoke-direct {p1, v0, v1, p0}, La/i3v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_1
    iget-object v0, p0, La/ipt;->j:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v1, p0, La/ipt;->k:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object p0, p0, La/ipt;->l:Ljava/lang/Object;

    .line 65
    .line 66
    sget-object v2, La/wne;->a:La/wne;

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, La/j0g0;

    .line 72
    .line 73
    invoke-direct {p1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, La/j0g0;

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, La/j0g0;

    .line 82
    .line 83
    invoke-direct {v1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    filled-new-array {p1, v0, v1}, [La/j0g0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance p1, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_1

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, La/j0g0;

    .line 114
    .line 115
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    sget-object v2, La/iun;->a:La/iun;

    .line 118
    .line 119
    instance-of v3, v1, La/g0g0;

    .line 120
    .line 121
    if-eqz v3, :cond_0

    .line 122
    .line 123
    move-object v1, v2

    .line 124
    :cond_0
    check-cast v1, Ljava/lang/Iterable;

    .line 125
    .line 126
    invoke-static {p1, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, La/j0g0;

    .line 151
    .line 152
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_2

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    const/4 v0, 0x0

    .line 162
    :goto_1
    if-nez v0, :cond_4

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    throw v0

    .line 166
    :cond_5
    :goto_2
    return-object p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/ipt;->i:B

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    check-cast p1, La/j0g0;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, La/j0g0;

    .line 12
    .line 13
    iget-object p1, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p3, La/j0g0;

    .line 16
    .line 17
    iget-object p2, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p4, La/yje;

    .line 20
    .line 21
    new-instance p3, La/ipt;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {p3, v0, p4, v1}, La/ipt;-><init>(ILa/yje;B)V

    .line 25
    .line 26
    .line 27
    iput-object p0, p3, La/ipt;->j:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p1, p3, La/ipt;->k:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p2, p3, La/ipt;->l:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p3, p0}, La/ipt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, La/j0g0;

    .line 43
    .line 44
    iget-object p1, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, La/j0g0;

    .line 47
    .line 48
    iget-object p2, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p4, La/yje;

    .line 51
    .line 52
    new-instance p3, La/ipt;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p3, v0, p4, v1}, La/ipt;-><init>(ILa/yje;B)V

    .line 56
    .line 57
    .line 58
    iput-object p0, p3, La/ipt;->j:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object p1, p3, La/ipt;->k:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p2, p3, La/ipt;->l:Ljava/lang/Object;

    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    invoke-virtual {p3, p0}, La/ipt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_1
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, La/j0g0;

    .line 74
    .line 75
    iget-object p1, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p3, La/j0g0;

    .line 78
    .line 79
    iget-object p2, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p4, La/yje;

    .line 82
    .line 83
    new-instance p3, La/ipt;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {p3, v0, p4, v1}, La/ipt;-><init>(ILa/yje;B)V

    .line 87
    .line 88
    .line 89
    iput-object p0, p3, La/ipt;->j:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p1, p3, La/ipt;->k:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p2, p3, La/ipt;->l:Ljava/lang/Object;

    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    invoke-virtual {p3, p0}, La/ipt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
