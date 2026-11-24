.class public final synthetic La/xs3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zu3;


# direct methods
.method public synthetic constructor <init>(La/zu3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xs3;->a:B

    iput-object p1, p0, La/xs3;->b:La/zu3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/xs3;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xs3;->b:La/zu3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/zu3;->u:La/z7z;

    .line 9
    .line 10
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, La/u6k;

    .line 15
    .line 16
    invoke-interface {v1}, La/u6k;->a()La/rqt;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/u6k;

    .line 28
    .line 29
    invoke-interface {v1}, La/u6k;->c()La/tqt;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/u6k;

    .line 41
    .line 42
    invoke-interface {v0}, La/u6k;->b()La/sqt;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, La/zu3;->b:La/z7z;

    .line 50
    .line 51
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/dpx;

    .line 56
    .line 57
    iget-object v0, v0, La/dpx;->a:La/a1d;

    .line 58
    .line 59
    invoke-virtual {v0}, La/a1d;->i()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    iget-object v0, p0, La/zu3;->d:La/z7z;

    .line 66
    .line 67
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/y58;

    .line 72
    .line 73
    invoke-interface {v0}, La/y58;->i()La/gl5;

    .line 74
    .line 75
    .line 76
    new-instance v0, La/jf4;

    .line 77
    .line 78
    const/16 v1, 0x1a

    .line 79
    .line 80
    invoke-direct {v0, v1}, La/jf4;-><init>(B)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-direct {v1, v2, v0, v3}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;Z)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, La/zu3;->A:La/z7z;

    .line 92
    .line 93
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/bh3;

    .line 98
    .line 99
    invoke-virtual {v0}, La/bh3;->a()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :goto_0
    iget-object p0, p0, La/zu3;->c:La/i1w0;

    .line 104
    .line 105
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v2, La/y0w0;

    .line 110
    .line 111
    invoke-direct {v2, v1}, La/y0w0;-><init>(La/m7h0;)V

    .line 112
    .line 113
    .line 114
    new-instance v1, La/c8d;

    .line 115
    .line 116
    sget-object v3, La/y7d;->a:La/v7d;

    .line 117
    .line 118
    invoke-direct {v1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 119
    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_1
    move-object v1, v0

    .line 127
    check-cast v1, La/paw;

    .line 128
    .line 129
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_1

    .line 134
    .line 135
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, La/oe50;

    .line 140
    .line 141
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_0
    iget-object p0, p0, La/zu3;->J:La/z7z;

    .line 149
    .line 150
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, La/pru;

    .line 155
    .line 156
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
