.class public final synthetic La/rzp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/enc;

.field public final synthetic c:La/jzp;


# direct methods
.method public synthetic constructor <init>(La/enc;La/jzp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rzp;->a:B

    iput-object p1, p0, La/rzp;->b:La/enc;

    iput-object p2, p0, La/rzp;->c:La/jzp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/rzp;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/rzp;->c:La/jzp;

    .line 4
    .line 5
    iget-object p0, p0, La/rzp;->b:La/enc;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/enc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, v0}, La/enc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
