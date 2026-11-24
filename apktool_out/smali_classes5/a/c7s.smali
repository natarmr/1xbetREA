.class public final La/c7s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/haj;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/haj;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/c7s;->a:B

    iput-object p1, p0, La/c7s;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/c7s;->c:La/haj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/c7s;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/c7s;->c:La/haj;

    .line 4
    .line 5
    iget-object p0, p0, La/c7s;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    new-instance v0, La/l6s;

    .line 17
    .line 18
    check-cast v1, La/caj;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v1, La/jaj;->g:La/jaj;

    .line 24
    .line 25
    invoke-direct {v0, p1, v1}, La/l6s;-><init>(ZLa/jaj;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    new-instance v0, La/l6s;

    .line 41
    .line 42
    check-cast v1, La/aaj;

    .line 43
    .line 44
    iget-object v1, v1, La/aaj;->a:La/jaj;

    .line 45
    .line 46
    invoke-direct {v0, p1, v1}, La/l6s;-><init>(ZLa/jaj;)V

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
