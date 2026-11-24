.class public final La/qex;
.super La/veq;
.source "SourceFile"


# static fields
.field public static final b:La/ueq;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/ueq;

    .line 2
    .line 3
    sget-object v1, La/meq;->c:La/meq;

    .line 4
    .line 5
    sget-object v2, La/meq;->f:La/meq;

    .line 6
    .line 7
    sget-object v3, La/tul0;->a:La/tul0;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, La/ueq;-><init>(La/meq;La/meq;La/tul0;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, La/qex;->b:La/ueq;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
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
    iput-object p1, p0, La/qex;->a:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()La/ueq;
    .locals 0

    .line 1
    sget-object p0, La/qex;->b:La/ueq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/qex;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
