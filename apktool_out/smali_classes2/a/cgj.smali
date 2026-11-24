.class public final synthetic La/cgj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x2i;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/x2i;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cgj;->a:B

    iput-object p1, p0, La/cgj;->b:La/x2i;

    iput-object p2, p0, La/cgj;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-byte p1, p0, La/cgj;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/cgj;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/cgj;->b:La/x2i;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, La/ymx;->g:La/ymx;

    .line 11
    .line 12
    new-instance v1, La/dgj;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v0, v2}, La/dgj;-><init>(La/x2i;La/cp;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, La/dyb;->P(La/ymx;Lkotlin/jvm/functions/Function0;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    sget-object p1, La/ymx;->g:La/ymx;

    .line 23
    .line 24
    new-instance v1, La/dgj;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v1, p0, v0, v2}, La/dgj;-><init>(La/x2i;La/cp;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1}, La/dyb;->P(La/ymx;Lkotlin/jvm/functions/Function0;)Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
