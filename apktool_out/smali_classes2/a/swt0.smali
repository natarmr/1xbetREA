.class public final synthetic La/swt0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements La/xdr;


# static fields
.field public static final a:La/swt0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/swt0;

    .line 2
    .line 3
    const-string v4, "handleValidation(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, La/nvt0;

    .line 8
    .line 9
    const-string v3, "handleValidation"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/swt0;->a:La/swt0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/nvt0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/String;

    .line 4
    .line 5
    check-cast p3, La/bvt0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    sput-object p0, Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;->d:La/dvt0;

    .line 18
    .line 19
    iget-object p1, p1, La/nvt0;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroid/content/Intent;

    .line 25
    .line 26
    const-class v1, Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;

    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    const-string v1, "vk_validation_url"

    .line 32
    .line 33
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-object v0, p1

    .line 41
    :goto_0
    instance-of v1, v0, Landroid/app/Activity;

    .line 42
    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    instance-of v2, v0, Landroid/content/ContextWrapper;

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    check-cast v0, Landroid/content/ContextWrapper;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    if-eqz v1, :cond_1

    .line 60
    .line 61
    check-cast v0, Landroid/app/Activity;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v0, p0

    .line 65
    :goto_1
    if-nez v0, :cond_2

    .line 66
    .line 67
    const/high16 v0, 0x10000000

    .line 68
    .line 69
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, La/fwt0;->a()V

    .line 76
    .line 77
    .line 78
    sget-object p1, Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;->d:La/dvt0;

    .line 79
    .line 80
    const-string p2, "Latch is null!"

    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    iput-object p1, p3, La/bvt0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object p1, p3, La/bvt0;->a:La/ilp0;

    .line 87
    .line 88
    iget-object p1, p1, La/ilp0;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 97
    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 101
    .line 102
    .line 103
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    move-object p1, p0

    .line 107
    :goto_2
    if-eqz p1, :cond_4

    .line 108
    .line 109
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    invoke-static {p2}, La/hny;->u(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_5
    move-object p1, p0

    .line 117
    :goto_3
    if-nez p1, :cond_8

    .line 118
    .line 119
    iget-object p1, p3, La/bvt0;->a:La/ilp0;

    .line 120
    .line 121
    iget-object p1, p1, La/ilp0;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 124
    .line 125
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 130
    .line 131
    if-eqz p1, :cond_6

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 134
    .line 135
    .line 136
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    move-object p1, p0

    .line 140
    :goto_4
    if-eqz p1, :cond_7

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_7
    invoke-static {p2}, La/hny;->u(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_8
    :goto_5
    sput-object p0, Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;->d:La/dvt0;

    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0
.end method
