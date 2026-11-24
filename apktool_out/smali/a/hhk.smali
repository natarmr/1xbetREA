.class public final La/hhk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/h950;La/roi0;La/xbu0;ZLa/hhk;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, La/hhk;->b:Ljava/lang/Object;

    .line 71
    iput-object p2, p0, La/hhk;->c:Ljava/lang/Object;

    .line 72
    iput-object p3, p0, La/hhk;->d:Ljava/lang/Object;

    .line 73
    iput-boolean p4, p0, La/hhk;->a:Z

    .line 74
    iput-object p5, p0, La/hhk;->e:Ljava/lang/Object;

    .line 75
    iput-object p6, p0, La/hhk;->f:Ljava/lang/Object;

    .line 76
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, La/hhk;->g:Ljava/lang/Object;

    .line 77
    sget-object p1, La/kd40;->a:La/jd40;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/jd40;->a()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, La/hhk;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/h950;La/roi0;La/xbu0;ZLjava/util/List;I)V
    .locals 7

    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    .line 63
    sget-object p5, La/iun;->a:La/iun;

    :cond_0
    move-object v6, p5

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 64
    invoke-direct/range {v0 .. v6}, La/hhk;-><init>(La/h950;La/roi0;La/xbu0;ZLa/hhk;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(La/j83;La/w6k;La/mrq;La/y9q0;Ljava/util/List;Z)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, La/hhk;->b:Ljava/lang/Object;

    .line 58
    iput-object p4, p0, La/hhk;->c:Ljava/lang/Object;

    .line 59
    iput-boolean p6, p0, La/hhk;->a:Z

    .line 60
    iput-object p2, p0, La/hhk;->d:Ljava/lang/Object;

    .line 61
    iput-object p3, p0, La/hhk;->e:Ljava/lang/Object;

    .line 62
    iput-object p5, p0, La/hhk;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;La/s2c0;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, La/hhk;->a:Z

    .line 6
    .line 7
    iput-object p2, p0, La/hhk;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, La/hhk;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, La/hhk;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, La/hhk;->f:Ljava/lang/Object;

    .line 14
    .line 15
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 p2, 0x1f

    .line 18
    .line 19
    if-lt p1, p2, :cond_0

    .line 20
    .line 21
    sget-object p1, La/jiq0;->m:[B

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    goto :goto_0

    .line 29
    :pswitch_0
    sget-object p1, La/jiq0;->n:[B

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_1
    sget-object p1, La/jiq0;->o:[B

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_2
    sget-object p1, La/jiq0;->p:[B

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_3
    sget-object p1, La/jiq0;->q:[B

    .line 39
    .line 40
    :goto_0
    iput-object p1, p0, La/hhk;->d:Ljava/lang/Object;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;La/ybo0;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, La/hhk;->b:Ljava/lang/Object;

    .line 67
    iput-object p2, p0, La/hhk;->c:Ljava/lang/Object;

    .line 68
    iput-object p3, p0, La/hhk;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([I[ILa/ens;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p3, p0, La/hhk;->b:Ljava/lang/Object;

    .line 45
    iput-object p1, p0, La/hhk;->c:Ljava/lang/Object;

    .line 46
    invoke-static {p1}, La/hhk;->b([I)I

    move-result p3

    .line 47
    invoke-static {p3}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    move-result-object p3

    .line 48
    iput-object p3, p0, La/hhk;->d:Ljava/lang/Object;

    .line 49
    iput-object p2, p0, La/hhk;->e:Ljava/lang/Object;

    .line 50
    invoke-static {p1, p2}, La/hhk;->c([I[I)I

    move-result p2

    .line 51
    invoke-static {p2}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    move-result-object p2

    .line 52
    iput-object p2, p0, La/hhk;->f:Ljava/lang/Object;

    .line 53
    new-instance p2, La/lbz;

    .line 54
    invoke-static {p1}, La/tx3;->T([I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/16 p3, 0x5a

    const/16 v0, 0xc8

    .line 55
    invoke-direct {p2, p1, p3, v0}, La/lbz;-><init>(III)V

    iput-object p2, p0, La/hhk;->h:Ljava/lang/Object;

    return-void
.end method

.method public static b([I)I
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const v1, 0x7fffffff

    .line 3
    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v4, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v0, :cond_2

    .line 9
    .line 10
    aget v5, p0, v3

    .line 11
    .line 12
    if-gtz v5, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    if-le v4, v5, :cond_1

    .line 16
    .line 17
    move v4, v5

    .line 18
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    if-ne v4, v1, :cond_3

    .line 22
    .line 23
    :goto_1
    return v2

    .line 24
    :cond_3
    return v4
.end method

.method public static c([I[I)I
    .locals 7

    .line 1
    invoke-static {p0}, La/hhk;->b([I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p1

    .line 6
    const v2, 0x7fffffff

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v5, v2

    .line 11
    move v4, v3

    .line 12
    :goto_0
    if-ge v4, v1, :cond_1

    .line 13
    .line 14
    aget v6, p0, v4

    .line 15
    .line 16
    if-ne v6, v0, :cond_0

    .line 17
    .line 18
    aget v6, p1, v4

    .line 19
    .line 20
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-ne v5, v2, :cond_2

    .line 28
    .line 29
    return v3

    .line 30
    :cond_2
    return v5
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    iget-object v0, p0, La/hhk;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    .line 5
    .line 6
    iget-object v0, p0, La/hhk;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    iget-boolean v2, p0, La/hhk;->a:Z

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, p0, La/hhk;->e:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput-boolean v2, p0, La/hhk;->a:Z

    .line 24
    .line 25
    new-instance v3, La/zbo0;

    .line 26
    .line 27
    invoke-direct {v3, v1}, La/zbo0;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 28
    .line 29
    .line 30
    iput-object v3, p0, La/hhk;->f:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, La/wbo0;

    .line 36
    .line 37
    invoke-direct {v3, v0, v2}, La/wbo0;-><init>(Landroid/view/ViewGroup;B)V

    .line 38
    .line 39
    .line 40
    iput-object v3, p0, La/hhk;->g:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v2, v1, Lcom/google/android/material/tabs/TabLayout;->o1:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    new-instance v2, La/l5g;

    .line 54
    .line 55
    const/16 v3, 0x8

    .line 56
    .line 57
    invoke-direct {v2, p0, v3}, La/l5g;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    iput-object v2, p0, La/hhk;->h:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v3, p0, La/hhk;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, La/yge0;

    .line 65
    .line 66
    invoke-virtual {v3, v2}, La/yge0;->v(La/ahe0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/hhk;->g()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v5, 0x1

    .line 77
    const/4 v6, 0x1

    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v4, 0x1

    .line 80
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/material/tabs/TabLayout;->l(IFZZZ)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    const-string p0, "TabLayoutMediator attached before ViewPager2 has an adapter"

    .line 85
    .line 86
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    const-string p0, "TabLayoutMediator is already attached"

    .line 91
    .line 92
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public d(I)Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-object v0, p0, La/hhk;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, La/hhk;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/hhk;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/hhk;->d(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    return-object v0
.end method

.method public e(La/k6z;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/hhk;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/w5z;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La/hhk;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/k6z;

    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/w5z;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    :cond_0
    iput-object p1, p0, La/hhk;->h:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, La/hhk;->b:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v2, v0

    .line 24
    check-cast v2, La/j83;

    .line 25
    .line 26
    iget-object v0, p0, La/hhk;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/y9q0;

    .line 29
    .line 30
    invoke-static {v0, p1}, La/afn0;->A(La/y9q0;La/k6z;)La/y9q0;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget-object p1, p0, La/hhk;->d:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    check-cast v3, La/w6k;

    .line 38
    .line 39
    iget-object p1, p0, La/hhk;->e:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    check-cast v4, La/mrq;

    .line 43
    .line 44
    iget-object p1, p0, La/hhk;->f:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v6, p1

    .line 47
    check-cast v6, Ljava/util/List;

    .line 48
    .line 49
    iget-boolean v7, p0, La/hhk;->a:Z

    .line 50
    .line 51
    new-instance v1, La/w5z;

    .line 52
    .line 53
    invoke-direct/range {v1 .. v7}, La/w5z;-><init>(La/j83;La/w6k;La/mrq;La/y9q0;Ljava/util/List;Z)V

    .line 54
    .line 55
    .line 56
    move-object v0, v1

    .line 57
    :cond_1
    iput-object v0, p0, La/hhk;->g:Ljava/lang/Object;

    .line 58
    .line 59
    return-void
.end method

.method public f(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p2, "compressed"

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, La/hhk;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/s2c0;

    .line 28
    .line 29
    invoke-interface {p0}, La/s2c0;->d()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public g()V
    .locals 6

    .line 1
    iget-object v0, p0, La/hhk;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->i()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/hhk;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/yge0;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1}, La/yge0;->d()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v3, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->g()La/tbo0;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, La/hhk;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, La/ybo0;

    .line 29
    .line 30
    invoke-interface {v5, v4, v3}, La/ybo0;->g(La/tbo0;I)V

    .line 31
    .line 32
    .line 33
    iget-object v5, v0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v0, v4, v5, v2}, Lcom/google/android/material/tabs/TabLayout;->a(La/tbo0;IZ)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    if-lez v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x1

    .line 52
    sub-int/2addr v1, v2

    .line 53
    iget-object p0, p0, La/hhk;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eq p0, v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Lcom/google/android/material/tabs/TabLayout;->f(I)La/tbo0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v0, p0, v2}, Lcom/google/android/material/tabs/TabLayout;->j(La/tbo0;Z)V

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void
.end method

.method public h(Ljava/io/Serializable;I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/hhk;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, La/ghk;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1}, La/ghk;-><init>(La/hhk;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i(Ljava/util/List;)La/hhk;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/hhk;

    .line 5
    .line 6
    iget-object v1, p0, La/hhk;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, La/h950;

    .line 9
    .line 10
    iget-object v2, p0, La/hhk;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, La/roi0;

    .line 13
    .line 14
    iget-object v3, p0, La/hhk;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, La/xbu0;

    .line 17
    .line 18
    iget-boolean v4, p0, La/hhk;->a:Z

    .line 19
    .line 20
    iget-object v5, p0, La/hhk;->f:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v6, v5

    .line 23
    check-cast v6, Ljava/util/List;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    invoke-direct/range {v0 .. v6}, La/hhk;-><init>(La/h950;La/roi0;La/xbu0;ZLa/hhk;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, La/f4d0;

    .line 44
    .line 45
    iget-object v1, v0, La/hhk;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    iget v2, p1, La/f4d0;->e:I

    .line 50
    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget p1, p1, La/f4d0;->d:I

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-object v0
.end method
