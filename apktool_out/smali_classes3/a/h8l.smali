.class public final synthetic La/h8l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:La/i8l;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;La/i8l;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h8l;->a:B

    iput-object p1, p0, La/h8l;->b:Landroid/content/Context;

    iput-object p2, p0, La/h8l;->c:La/i8l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/h8l;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/h8l;->c:La/i8l;

    .line 4
    .line 5
    iget-object p0, p0, La/h8l;->b:Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/j8l;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, v2}, La/j8l;-><init>(Landroid/content/Context;Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, Landroid/widget/ImageView;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, v1, La/i8l;->a:La/p7l;

    .line 26
    .line 27
    iget v2, p0, La/p7l;->g:F

    .line 28
    .line 29
    iget p0, p0, La/p7l;->e:F

    .line 30
    .line 31
    mul-float/2addr v2, p0

    .line 32
    float-to-int p0, v2

    .line 33
    invoke-static {v0, p0}, La/hxm0;->x(Landroid/view/View;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
