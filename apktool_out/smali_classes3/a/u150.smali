.class public final La/u150;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/k250;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/k250;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u150;->a:B

    iput-object p1, p0, La/u150;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/u150;->c:La/k250;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u150;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/u150;->c:La/k250;

    .line 4
    .line 5
    iget-object p0, p0, La/u150;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/d150;

    .line 11
    .line 12
    check-cast v1, La/y150;

    .line 13
    .line 14
    iget-object v1, v1, La/y150;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/d150;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance v0, La/x050;

    .line 26
    .line 27
    check-cast v1, La/y150;

    .line 28
    .line 29
    iget-object v1, v1, La/y150;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v0, v1}, La/x050;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    new-instance v0, La/h150;

    .line 41
    .line 42
    check-cast v1, La/b250;

    .line 43
    .line 44
    iget-object v1, v1, La/b250;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/h150;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_2
    new-instance v0, La/a150;

    .line 56
    .line 57
    check-cast v1, La/i250;

    .line 58
    .line 59
    iget-object v1, v1, La/i250;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v0, v1}, La/a150;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_3
    new-instance v0, La/a150;

    .line 71
    .line 72
    check-cast v1, La/z150;

    .line 73
    .line 74
    iget-object v1, v1, La/z150;->a:Ljava/lang/String;

    .line 75
    .line 76
    invoke-direct {v0, v1}, La/a150;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
