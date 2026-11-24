.class public final synthetic La/wlw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:[La/xlw;


# direct methods
.method public synthetic constructor <init>([La/xlw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wlw;->a:B

    iput-object p1, p0, La/wlw;->b:[La/xlw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wlw;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wlw;->b:[La/xlw;

    .line 4
    .line 5
    check-cast p1, La/ou90;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {p1, v0, p0, p2}, La/xww;->Q(La/ou90;Z[La/xlw;F)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    const/4 v0, 0x0

    .line 27
    invoke-static {p1, v0, p0, p2}, La/xww;->Q(La/ou90;Z[La/xlw;F)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
