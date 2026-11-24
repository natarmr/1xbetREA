.class public final La/wji0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/m5d0;

.field public final c:La/m5d0;


# direct methods
.method public synthetic constructor <init>(La/m5d0;La/m5d0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wji0;->a:B

    iput-object p1, p0, La/wji0;->b:La/m5d0;

    iput-object p2, p0, La/wji0;->c:La/m5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wji0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wji0;->c:La/m5d0;

    .line 4
    .line 5
    iget-object p0, p0, La/wji0;->b:La/m5d0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w6j0;

    .line 15
    .line 16
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/w6j0;

    .line 21
    .line 22
    new-instance v1, La/xmi0;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/xmi0;-><init>(La/w6j0;La/w6j0;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :pswitch_0
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, La/olq0;

    .line 33
    .line 34
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/out0;

    .line 39
    .line 40
    new-instance v1, La/vji0;

    .line 41
    .line 42
    invoke-direct {v1, p0, v0}, La/vji0;-><init>(La/olq0;La/out0;)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
