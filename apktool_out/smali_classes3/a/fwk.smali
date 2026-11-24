.class public final La/fwk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/shk;


# direct methods
.method public constructor <init>(La/shk;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/fwk;->a:La/shk;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/Configuration;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/fwk;->a:La/shk;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroid/content/res/Configuration;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/shk;->a:La/p7m0;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, La/ahk;

    .line 22
    .line 23
    iget v2, v1, Landroid/content/res/Configuration;->densityDpi:I

    .line 24
    .line 25
    int-to-float v2, v2

    .line 26
    const/high16 v3, 0x43200000    # 160.0f

    .line 27
    .line 28
    div-float/2addr v2, v3

    .line 29
    iget v3, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 30
    .line 31
    move v4, v2

    .line 32
    new-instance v2, La/z6k;

    .line 33
    .line 34
    invoke-direct {v2, v4, v3}, La/z6k;-><init>(FF)V

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/16 v6, 0x3c

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v0 .. v6}, La/ahk;->a(La/ahk;Landroid/content/res/Configuration;La/z6k;La/erq;La/t9o0;La/sly;I)La/ahk;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    return-void
.end method
