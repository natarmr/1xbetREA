.class public final synthetic La/vgt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xgt0;


# direct methods
.method public synthetic constructor <init>(La/xgt0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vgt0;->a:B

    iput-object p1, p0, La/vgt0;->b:La/xgt0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vgt0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/vgt0;->b:La/xgt0;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/xgt0;->r:La/duj;

    .line 15
    .line 16
    new-instance v2, La/ggt0;

    .line 17
    .line 18
    invoke-direct {v2, p0, v1}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 31
    .line 32
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 33
    .line 34
    instance-of p1, p1, La/ff5;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, La/ocj;->a:La/p7m0;

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-object v1, p0

    .line 49
    check-cast v1, La/sgt0;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v1, La/iun;->a:La/iun;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v3, La/sgt0;

    .line 60
    .line 61
    invoke-direct {v3, v1, v2, v2}, La/sgt0;-><init>(Ljava/util/List;ZZ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 72
    .line 73
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-object v3, p1

    .line 81
    check-cast v3, La/sgt0;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v2, v1}, La/sgt0;->a(La/sgt0;ZZ)La/sgt0;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {p0, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_2

    .line 95
    .line 96
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
