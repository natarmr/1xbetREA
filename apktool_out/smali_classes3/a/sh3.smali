.class public final synthetic La/sh3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ij3;


# direct methods
.method public synthetic constructor <init>(La/ij3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sh3;->a:B

    iput-object p1, p0, La/sh3;->b:La/ij3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/sh3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/sh3;->b:La/ij3;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v0, p0, La/ij3;->e:La/mne;

    .line 19
    .line 20
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 21
    .line 22
    sget-object v3, La/oi3;->a:La/oi3;

    .line 23
    .line 24
    new-instance v6, La/pi3;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v6, p0, p1, v1, v4}, La/pi3;-><init>(La/ij3;Ljava/lang/String;La/yje;B)V

    .line 28
    .line 29
    .line 30
    const/16 v7, 0xa

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    iget-object v11, v0, La/mne;->c:La/vs10;

    .line 41
    .line 42
    sget-object v9, La/qi3;->a:La/qi3;

    .line 43
    .line 44
    new-instance v12, La/pi3;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {v12, p0, p1, v1, v0}, La/pi3;-><init>(La/ij3;Ljava/lang/String;La/yje;B)V

    .line 48
    .line 49
    .line 50
    const/16 v13, 0xa

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    iget-object v12, p0, La/ij3;->j0:La/p7m0;

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    move-object v0, p1

    .line 72
    check-cast v0, La/jh3;

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    const/16 v11, 0x7ff

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    const/4 v2, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    invoke-static/range {v0 .. v11}, La/jh3;->a(La/jh3;La/iy3;Ljava/util/ArrayList;La/ph3;La/oc5;La/oc5;Ljava/lang/String;La/yfw;Ljava/util/Set;ZZI)La/jh3;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v12, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    if-eqz v10, :cond_2

    .line 96
    .line 97
    iget-object p0, p0, La/ij3;->i0:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/bby;

    .line 114
    .line 115
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 120
    .line 121
    .line 122
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_1
    check-cast p1, La/im3;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object p0, p0, La/ij3;->k0:La/p7m0;

    .line 131
    .line 132
    new-instance v0, La/pf50;

    .line 133
    .line 134
    invoke-direct {v0, p1}, La/pf50;-><init>(La/im3;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
