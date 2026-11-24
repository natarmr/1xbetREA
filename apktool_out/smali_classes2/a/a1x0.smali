.class public final synthetic La/a1x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lin0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zcw0;


# direct methods
.method public synthetic constructor <init>(La/zcw0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a1x0;->a:B

    iput-object p1, p0, La/a1x0;->b:La/zcw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a1x0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/a1x0;->b:La/zcw0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/o7x0;

    .line 9
    .line 10
    iget-object p0, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/lin0;

    .line 13
    .line 14
    invoke-direct {v0, p0}, La/o7x0;-><init>(La/lin0;)V

    .line 15
    .line 16
    .line 17
    new-instance p0, La/ztb0;

    .line 18
    .line 19
    invoke-direct {p0, v0}, La/ztb0;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object p0, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Landroid/content/Context;

    .line 26
    .line 27
    sget-object v0, La/c1x0;->j:Ljava/lang/Object;

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "com.google.android.gms"

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, La/ztb0;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, p0}, La/ztb0;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    sget-object v0, La/p0;->a:La/p0;

    .line 50
    .line 51
    :goto_0
    return-object v0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
