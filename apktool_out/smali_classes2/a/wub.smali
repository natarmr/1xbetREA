.class public final La/wub;
.super La/uub;
.source "SourceFile"


# static fields
.field public static final b:La/wub;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/wub;

    .line 2
    .line 3
    const-string v1, "CharMatcher.none()"

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/wub;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/wub;->b:La/wub;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wub;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/wub;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
