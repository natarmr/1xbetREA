.class public final La/exe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cqq;

.field public final synthetic c:La/wpq;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/cqq;La/wpq;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/exe0;->a:B

    iput-object p1, p0, La/exe0;->b:La/cqq;

    iput-object p2, p0, La/exe0;->c:La/wpq;

    iput-object p3, p0, La/exe0;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p2, p0, La/exe0;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/exe0;->d:La/pz40;

    .line 4
    .line 5
    iget-object v1, p0, La/exe0;->c:La/wpq;

    .line 6
    .line 7
    iget-object p0, p0, La/exe0;->b:La/cqq;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, La/cqq;->a(La/cqq;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, La/wpq;->a(La/wpq;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    sget-object p1, La/c9f0;->a:La/c9f0;

    .line 30
    .line 31
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, La/cqq;->a(La/cqq;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, La/wpq;->a(La/wpq;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    sget-object p1, La/pve0;->a:La/pve0;

    .line 55
    .line 56
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
