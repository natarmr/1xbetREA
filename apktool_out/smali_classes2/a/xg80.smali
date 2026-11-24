.class public final La/xg80;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:La/xg80;

.field public static final b:La/pfw;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/xg80;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xg80;->a:La/xg80;

    .line 7
    .line 8
    new-instance v0, La/pfw;

    .line 9
    .line 10
    const-string v1, "PackageViewDescriptorFactory"

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/xg80;->b:La/pfw;

    .line 17
    .line 18
    return-void
.end method
