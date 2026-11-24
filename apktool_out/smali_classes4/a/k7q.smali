.class public final synthetic La/k7q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r8q;


# direct methods
.method public synthetic constructor <init>(La/r8q;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k7q;->a:B

    iput-object p1, p0, La/k7q;->b:La/r8q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/k7q;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/k7q;->b:La/r8q;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/r8q;->T:La/ol60;

    .line 9
    .line 10
    sget-object v0, La/b8q;->a:La/b8q;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object p0, p0, La/r8q;->T:La/ol60;

    .line 19
    .line 20
    sget-object v0, La/u7q;->a:La/u7q;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
