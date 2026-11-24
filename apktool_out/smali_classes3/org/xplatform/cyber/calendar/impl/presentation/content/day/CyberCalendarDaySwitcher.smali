.class public final Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final q:La/a8z;

.field public final r:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/lhf;

    .line 16
    .line 17
    const/4 p3, 0x4

    .line 18
    invoke-direct {p2, p0, p0, p3}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->q:La/a8z;

    .line 26
    .line 27
    invoke-static {}, La/cy7;->c()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput-boolean p1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->r:Z

    .line 32
    .line 33
    new-instance v0, La/a6g;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const-class v2, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;

    .line 38
    .line 39
    const-string v3, "binding"

    .line 40
    .line 41
    const-string v4, "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDaySwitcherBinding;"

    .line 42
    .line 43
    move-object v1, p0

    .line 44
    invoke-direct/range {v0 .. v6}, La/a6g;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, La/a6g;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private final getBinding()La/b6g;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/b6g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final synthetic u(Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;)La/b6g;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->getBinding()La/b6g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final setDate(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->getBinding()La/b6g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/b6g;->d:Landroid/widget/TextView;

    .line 6
    .line 7
    sget-object v0, La/rdj;->a:La/rdj;

    .line 8
    .line 9
    sget-object v0, La/sdj;->i:La/sdj;

    .line 10
    .line 11
    new-instance v1, La/ynq0;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, La/ynq0;-><init>(J)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    const/16 p2, 0x3c

    .line 18
    .line 19
    invoke-static {v1, v0, p1, p2}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final v(La/i5g;La/i5g;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->getBinding()La/b6g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/b6g;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    new-instance v1, La/z5g;

    .line 8
    .line 9
    invoke-direct {v1, p0, p2, p1}, La/z5g;-><init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;La/i5g;La/i5g;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->getBinding()La/b6g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/b6g;->b:Landroid/widget/ImageView;

    .line 20
    .line 21
    new-instance v1, La/z5g;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, p1, p2, v2}, La/z5g;-><init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;La/i5g;La/i5g;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 28
    .line 29
    .line 30
    return-void
.end method
