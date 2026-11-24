.class public final La/mz70;
.super La/mjq;
.source "SourceFile"


# static fields
.field public static final d:La/mz70;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/mz70;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, La/mjq;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/mz70;->d:La/mz70;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(La/hu5;La/bv3;La/t9k0;La/pwi;La/s080;)V
    .locals 0

    .line 1
    iget p0, p3, La/t9k0;->t:I

    .line 2
    .line 3
    new-instance p1, La/sjs;

    .line 4
    .line 5
    const/4 p2, 0x4

    .line 6
    invoke-direct {p1, p4, p3, p2}, La/sjs;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0, p1}, La/t9k0;->m(ILkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
