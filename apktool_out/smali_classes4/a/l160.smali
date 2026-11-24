.class public final La/l160;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/jlb;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/jlb;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l160;->a:B

    iput-object p1, p0, La/l160;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/l160;->c:La/jlb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l160;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/l160;->c:La/jlb;

    .line 4
    .line 5
    iget-object p0, p0, La/l160;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/h2l0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, La/mb80;

    .line 16
    .line 17
    check-cast v1, La/hlb;

    .line 18
    .line 19
    iget-object v0, v1, La/hlb;->a:La/m5p;

    .line 20
    .line 21
    invoke-direct {p1, v0}, La/mb80;-><init>(La/m5p;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/h2l0;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance p1, La/uy50;

    .line 36
    .line 37
    check-cast v1, La/hlb;

    .line 38
    .line 39
    iget-object v0, v1, La/hlb;->a:La/m5p;

    .line 40
    .line 41
    invoke-direct {p1, v0}, La/uy50;-><init>(La/m5p;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
