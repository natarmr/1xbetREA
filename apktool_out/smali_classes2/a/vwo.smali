.class public final La/vwo;
.super La/ary;
.source "SourceFile"


# static fields
.field public static final f:La/vwo;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/vwo;

    .line 2
    .line 3
    new-instance v1, La/eu00;

    .line 4
    .line 5
    const-string v2, "FallbackBuiltIns"

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/eu00;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, La/ary;-><init>(La/eu00;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, La/ary;->c()V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/vwo;->f:La/vwo;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final q()La/qv90;
    .locals 0

    .line 1
    sget-object p0, La/m2a;->Z:La/m2a;

    .line 2
    .line 3
    return-object p0
.end method
