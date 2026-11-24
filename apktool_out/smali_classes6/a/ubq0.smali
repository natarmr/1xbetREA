.class public final synthetic La/ubq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xbq0;


# direct methods
.method public synthetic constructor <init>(La/xbq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ubq0;->a:B

    iput-object p1, p0, La/ubq0;->b:La/xbq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/ubq0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ubq0;->b:La/xbq0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/xbq0;->O1:La/m6m0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/xbq0;->K0()La/zbq0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, La/zbq0;->z()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    sget-object p1, La/xbq0;->O1:La/m6m0;

    .line 19
    .line 20
    invoke-virtual {p0}, La/xbq0;->K0()La/zbq0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, La/zbq0;->x()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    sget-object p1, La/xbq0;->O1:La/m6m0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/xbq0;->K0()La/zbq0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, La/zbq0;->y()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
