.class public final enum La/vgc0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/jh70;

.field public static final enum c:La/vgc0;

.field public static final enum d:La/vgc0;

.field public static final synthetic e:[La/vgc0;

.field public static final synthetic f:La/c0o;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/vgc0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x7f1312be

    .line 5
    .line 6
    .line 7
    const-string v3, "PROMO_SHOP"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, La/vgc0;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, La/vgc0;->c:La/vgc0;

    .line 13
    .line 14
    new-instance v1, La/vgc0;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const v3, 0x7f130db4

    .line 18
    .line 19
    .line 20
    const-string v4, "PROMO_LIST"

    .line 21
    .line 22
    invoke-direct {v1, v4, v2, v3}, La/vgc0;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v1, La/vgc0;->d:La/vgc0;

    .line 26
    .line 27
    filled-new-array {v0, v1}, [La/vgc0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/vgc0;->e:[La/vgc0;

    .line 32
    .line 33
    new-instance v1, La/c0o;

    .line 34
    .line 35
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, La/vgc0;->f:La/c0o;

    .line 39
    .line 40
    new-instance v0, La/jh70;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, La/vgc0;->b:La/jh70;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/vgc0;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/vgc0;
    .locals 1

    .line 1
    const-class v0, La/vgc0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vgc0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/vgc0;
    .locals 1

    .line 1
    sget-object v0, La/vgc0;->e:[La/vgc0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/vgc0;

    .line 8
    .line 9
    return-object v0
.end method
