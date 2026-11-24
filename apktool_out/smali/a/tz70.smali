.class public final La/tz70;
.super La/mjq;
.source "SourceFile"


# static fields
.field public static final d:La/tz70;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/tz70;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, La/mjq;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/tz70;->d:La/tz70;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(La/hu5;La/bv3;La/t9k0;La/pwi;La/s080;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, La/hu5;->g(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, La/bet;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3, p0}, La/t9k0;->c(La/bet;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p3, p0}, La/t9k0;->k(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
