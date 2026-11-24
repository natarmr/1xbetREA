.class public final synthetic La/bak0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w6k;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(La/w6k;FB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bak0;->a:B

    iput-object p1, p0, La/bak0;->b:La/w6k;

    iput p2, p0, La/bak0;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bak0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/bak0;->c:F

    .line 4
    .line 5
    iget-object p0, p0, La/bak0;->b:La/w6k;

    .line 6
    .line 7
    check-cast p1, La/uag0;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v1}, La/w6k;->w0(F)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-virtual {p1, p0}, La/uag0;->H(F)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    invoke-interface {p0, v1}, La/w6k;->w0(F)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    neg-float p0, p0

    .line 30
    invoke-virtual {p1, p0}, La/uag0;->H(F)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
