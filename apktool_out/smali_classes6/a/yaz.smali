.class public final synthetic La/yaz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dfv;

.field public final synthetic c:La/zaz;


# direct methods
.method public synthetic constructor <init>(La/dfv;La/zaz;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yaz;->a:B

    iput-object p1, p0, La/yaz;->b:La/dfv;

    iput-object p2, p0, La/yaz;->c:La/zaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yaz;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/yaz;->c:La/zaz;

    .line 4
    .line 5
    iget-object p0, p0, La/yaz;->b:La/dfv;

    .line 6
    .line 7
    check-cast p1, La/t33;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, La/dfv;->g(F)V

    .line 23
    .line 24
    .line 25
    iget-object p0, v1, La/zaz;->c:La/y2x;

    .line 26
    .line 27
    invoke-virtual {p0}, La/y2x;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, La/dfv;->g(F)V

    .line 44
    .line 45
    .line 46
    iget-object p0, v1, La/zaz;->c:La/y2x;

    .line 47
    .line 48
    invoke-virtual {p0}, La/y2x;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
