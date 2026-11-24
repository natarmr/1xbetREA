.class public final La/c3a;
.super La/d3a;
.source "SourceFile"


# static fields
.field public static final a:La/c3a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/c3a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/c3a;->a:La/c3a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "UnknownCameraStatus"

    .line 2
    .line 3
    return-object p0
.end method
