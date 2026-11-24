.class public final synthetic La/rg00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rg00;->a:B

    iput-object p1, p0, La/rg00;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget-byte v0, p0, La/rg00;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/rg00;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/tzi;

    .line 11
    .line 12
    iget p1, p1, Landroid/os/Message;->what:I

    .line 13
    .line 14
    if-eq p1, v2, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p1, v0, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object p0, p0, La/tzi;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, La/fum0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/fum0;->a()V

    .line 31
    .line 32
    .line 33
    :goto_0
    move v1, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p0, p0, La/tzi;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, La/eum0;

    .line 38
    .line 39
    invoke-virtual {p0}, La/eum0;->a()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object p0, p0, La/tzi;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, La/dum0;

    .line 46
    .line 47
    invoke-virtual {p0}, La/dum0;->a()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iget-object p0, p0, La/tzi;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, La/cum0;

    .line 54
    .line 55
    invoke-virtual {p0}, La/cum0;->a()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    return v1

    .line 60
    :pswitch_0
    check-cast p0, La/vg00;

    .line 61
    .line 62
    iget-object p1, p0, La/vg00;->c:La/tg00;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, La/vg00;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, La/ug00;

    .line 84
    .line 85
    iget-boolean v4, v3, La/ug00;->d:Z

    .line 86
    .line 87
    if-nez v4, :cond_5

    .line 88
    .line 89
    iget-boolean v4, v3, La/ug00;->c:Z

    .line 90
    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    iget-object v4, v3, La/ug00;->b:La/s88;

    .line 94
    .line 95
    invoke-virtual {v4}, La/s88;->e()La/jjq;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    new-instance v5, La/s88;

    .line 100
    .line 101
    const/4 v6, 0x6

    .line 102
    invoke-direct {v5, v6}, La/s88;-><init>(B)V

    .line 103
    .line 104
    .line 105
    iput-object v5, v3, La/ug00;->b:La/s88;

    .line 106
    .line 107
    iput-boolean v1, v3, La/ug00;->c:Z

    .line 108
    .line 109
    iget-object v3, v3, La/ug00;->a:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-interface {p1, v3, v4}, La/tg00;->b(Ljava/lang/Object;La/jjq;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    iget-object v3, p0, La/vg00;->b:La/q9o0;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v3, v3, La/q9o0;->a:Landroid/os/Handler;

    .line 120
    .line 121
    invoke-virtual {v3, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_4

    .line 126
    .line 127
    :cond_6
    return v2

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
