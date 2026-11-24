.class public final La/p160;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/fdp;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/fdp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p160;->a:B

    iput-object p1, p0, La/p160;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/p160;->c:La/fdp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/p160;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/p160;->c:La/fdp;

    .line 4
    .line 5
    iget-object p0, p0, La/p160;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/ib80;

    .line 11
    .line 12
    check-cast v1, La/edp;

    .line 13
    .line 14
    iget-object v1, v1, La/edp;->a:La/wcp;

    .line 15
    .line 16
    iget-object v2, v1, La/wcp;->a:La/tnp0;

    .line 17
    .line 18
    iget-object v1, v1, La/wcp;->e:Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct {v0, v2, v1}, La/ib80;-><init>(La/tnp0;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/nb80;

    .line 30
    .line 31
    check-cast v1, La/edp;

    .line 32
    .line 33
    iget-object v1, v1, La/edp;->a:La/wcp;

    .line 34
    .line 35
    iget-object v1, v1, La/wcp;->a:La/tnp0;

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/nb80;-><init>(La/tnp0;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    new-instance v0, La/ty50;

    .line 47
    .line 48
    check-cast v1, La/edp;

    .line 49
    .line 50
    iget-object v1, v1, La/edp;->a:La/wcp;

    .line 51
    .line 52
    iget-object v2, v1, La/wcp;->a:La/tnp0;

    .line 53
    .line 54
    iget-object v1, v1, La/wcp;->e:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v0, v2, v1}, La/ty50;-><init>(La/tnp0;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    new-instance v0, La/wy50;

    .line 66
    .line 67
    check-cast v1, La/edp;

    .line 68
    .line 69
    iget-object v1, v1, La/edp;->a:La/wcp;

    .line 70
    .line 71
    iget-object v1, v1, La/wcp;->a:La/tnp0;

    .line 72
    .line 73
    invoke-direct {v0, v1}, La/wy50;-><init>(La/tnp0;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
