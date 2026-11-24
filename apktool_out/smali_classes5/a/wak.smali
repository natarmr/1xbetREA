.class public final synthetic La/wak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bbk;


# direct methods
.method public synthetic constructor <init>(La/bbk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wak;->a:B

    iput-object p1, p0, La/wak;->b:La/bbk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/wak;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wak;->b:La/bbk;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/bbk;->O1:[La/iiy;

    .line 9
    .line 10
    invoke-virtual {p0}, La/bbk;->G0()La/jbk;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p1, La/pmz;->b:La/pmz;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/jbk;->x(La/pmz;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    sget-object p1, La/bbk;->O1:[La/iiy;

    .line 21
    .line 22
    invoke-virtual {p0}, La/bbk;->G0()La/jbk;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, La/pmz;->c:La/pmz;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/jbk;->x(La/pmz;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    sget-object p1, La/bbk;->O1:[La/iiy;

    .line 33
    .line 34
    invoke-virtual {p0}, La/bbk;->G0()La/jbk;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, La/jbk;->w()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
