.class public abstract La/vg80;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "PackageManagerHelper"

    .line 2
    .line 3
    invoke-static {v0}, La/wv00;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/vg80;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/vg80;->b:Ljava/util/HashMap;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;ZLkotlin/jvm/functions/Function2;)V
    .locals 5

    .line 1
    const-string v0, "disabled"

    .line 2
    .line 3
    const-string v1, "enabled"

    .line 4
    .line 5
    sget-object v2, La/vg80;->a:Ljava/lang/String;

    .line 6
    .line 7
    :try_start_0
    invoke-interface {p3, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    check-cast p3, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-ne p2, p3, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/4 p3, 0x1

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    move v3, p3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, 0x2

    .line 26
    :goto_0
    invoke-virtual {p0, p1, v3, p3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    move-object v3, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v3, v0

    .line 42
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p3, " "

    .line 51
    .line 52
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p0, v2, p3}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catch_0
    move-exception p0

    .line 67
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    move-object v0, v1

    .line 78
    :cond_3
    const-string p2, " could not be "

    .line 79
    .line 80
    invoke-static {p1, p2, v0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p3, v2, p1, p0}, La/wv00;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
