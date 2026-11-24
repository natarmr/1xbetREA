.class public final synthetic La/tdr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/udr0;


# direct methods
.method public synthetic constructor <init>(La/udr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tdr0;->a:B

    iput-object p1, p0, La/tdr0;->b:La/udr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/tdr0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/tdr0;->b:La/udr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/z140;

    .line 9
    .line 10
    sget-object v0, La/udr0;->O1:La/s2m0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/udr0;->M1:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/rio0;

    .line 22
    .line 23
    invoke-interface {p1}, La/z140;->getEventId()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, La/rio0;->z()La/r040;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, La/bww;->V(La/r040;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, p0, La/rio0;->t:La/ag3;

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v1, v3}, La/ag3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, La/rio0;->E:La/gg5;

    .line 45
    .line 46
    invoke-interface {p1}, La/z140;->getEventId()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {v2, v3, v1}, La/gg5;->l(ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, La/rio0;->u:La/y3v;

    .line 54
    .line 55
    invoke-interface {p1}, La/z140;->getTitle()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v1, v0, p1}, La/y3v;->h(ILjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p0, p0, La/rio0;->z:La/i1w0;

    .line 64
    .line 65
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    instance-of v1, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    new-instance v1, La/e1w0;

    .line 74
    .line 75
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 76
    .line 77
    invoke-direct {v1, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, La/c8d;

    .line 81
    .line 82
    sget-object v2, La/y7d;->a:La/v7d;

    .line 83
    .line 84
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    new-instance v1, La/w0w0;

    .line 92
    .line 93
    invoke-direct {v1, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, La/c8d;

    .line 97
    .line 98
    sget-object v2, La/y7d;->a:La/v7d;

    .line 99
    .line 100
    invoke-direct {p1, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :goto_0
    const/4 p1, 0x0

    .line 107
    invoke-static {p0, v0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_1
    move-object v0, p1

    .line 112
    check-cast v0, La/paw;

    .line 113
    .line 114
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_1

    .line 119
    .line 120
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/oe50;

    .line 125
    .line 126
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_0
    check-cast p1, La/f240;

    .line 134
    .line 135
    sget-object v0, La/udr0;->O1:La/s2m0;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, La/udr0;->M1:La/kiu0;

    .line 141
    .line 142
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    check-cast p0, La/rio0;

    .line 147
    .line 148
    invoke-virtual {p0, p1}, La/rio0;->E(La/f240;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
