.class public final La/bne;
.super La/veq;
.source "SourceFile"


# static fields
.field public static final b:La/ueq;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/ueq;

    .line 2
    .line 3
    sget-object v1, La/meq;->d:La/meq;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/tul0;->a:La/tul0;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, La/ueq;-><init>(La/meq;La/meq;La/tul0;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/bne;->b:La/ueq;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/bne;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()La/ueq;
    .locals 0

    .line 1
    sget-object p0, La/bne;->b:La/ueq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, La/bne;->a:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
