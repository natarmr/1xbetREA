.class public final La/xic;
.super La/r8x;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/Set;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:La/wic;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v6, "com.huawei.browser"

    .line 2
    .line 3
    const-string v7, "com.sec.android.app.sbrowser"

    .line 4
    .line 5
    const-string v0, "com.yandex.browser"

    .line 6
    .line 7
    const-string v1, "com.yandex.browser.beta"

    .line 8
    .line 9
    const-string v2, "com.yandex.browser.alpha"

    .line 10
    .line 11
    const-string v3, "com.android.chrome"

    .line 12
    .line 13
    const-string v4, "com.android.chrome.beta"

    .line 14
    .line 15
    const-string v5, "com.android.chrome.dev"

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, La/xic;->d:Ljava/util/Set;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xic;->b:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, La/cl5;

    .line 7
    .line 8
    const/16 v0, 0x19

    .line 9
    .line 10
    invoke-direct {p1, v0}, La/cl5;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v0, La/wic;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, p1, v1}, La/wic;-><init>(La/r8x;La/uw00;B)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/xic;->c:La/wic;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final K()La/bsr0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xic;->c:La/wic;

    .line 2
    .line 3
    return-object p0
.end method
