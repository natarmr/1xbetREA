.class public final synthetic La/y8k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/c9k;


# direct methods
.method public synthetic constructor <init>(La/c9k;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y8k;->a:B

    iput-object p1, p0, La/y8k;->b:La/c9k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/y8k;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y8k;->b:La/c9k;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/c9k;->Q1:La/nwd;

    .line 9
    .line 10
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, La/p9k;->x()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    sget-object p1, La/c9k;->Q1:La/nwd;

    .line 19
    .line 20
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object p1, La/j9k;->a:La/j9k;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/p9k;->y(La/k9k;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
