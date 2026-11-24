.class public final La/gdk;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/hdk;


# direct methods
.method public synthetic constructor <init>(La/hdk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gdk;->a:B

    iput-object p1, p0, La/gdk;->b:La/hdk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gdk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gdk;->b:La/hdk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, La/jcb;->V(La/cdk;Z)La/bv9;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    invoke-virtual {p0}, La/cdk;->B()La/rdk;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, La/rdk;->B()La/d0d0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, La/d0d0;->e()La/n0d0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, La/cdk;->B()La/rdk;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, La/rdk;->B()La/d0d0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object v0, La/ujn;->c:La/f93;

    .line 37
    .line 38
    invoke-static {p0, v0}, La/obb;->O(La/d0d0;La/g93;)La/n0d0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_0
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
