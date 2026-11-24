.class public final La/wbo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qbo0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wbo0;->a:B

    iput-object p1, p0, La/wbo0;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(La/tbo0;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(La/tbo0;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(La/tbo0;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(La/tbo0;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(La/tbo0;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/wbo0;->a:B

    return-void
.end method

.method public final b(La/tbo0;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/wbo0;->a:B

    return-void
.end method

.method public final c(La/tbo0;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/wbo0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wbo0;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    iget p1, p1, La/tbo0;->b:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast p0, Landroidx/viewpager/widget/ViewPager;

    .line 18
    .line 19
    iget p1, p1, La/tbo0;->b:I

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
