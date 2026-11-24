.class public final synthetic La/oec0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sec0;


# direct methods
.method public synthetic constructor <init>(La/sec0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oec0;->a:B

    iput-object p1, p0, La/oec0;->b:La/sec0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/oec0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/oec0;->b:La/sec0;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v0, p1, La/zhi0;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, La/zhi0;

    .line 22
    .line 23
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 24
    .line 25
    sget-object v3, La/i2o;->l1:La/i2o;

    .line 26
    .line 27
    if-ne v0, v3, :cond_1

    .line 28
    .line 29
    new-instance v0, La/gec0;

    .line 30
    .line 31
    iget-object v1, p0, La/sec0;->v:La/ctf0;

    .line 32
    .line 33
    new-array v3, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 36
    .line 37
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const v3, 0x7f1307bb

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    const-string p1, ""

    .line 55
    .line 56
    :cond_0
    invoke-direct {v0, v1, p1}, La/gec0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v0, p0, La/sec0;->u:La/duj;

    .line 64
    .line 65
    new-instance v2, La/xh20;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-direct {v2, p0, v3, v1}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, La/sec0;->u:La/duj;

    .line 81
    .line 82
    new-instance v3, La/xh20;

    .line 83
    .line 84
    invoke-direct {v3, p0, v2, v1}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
