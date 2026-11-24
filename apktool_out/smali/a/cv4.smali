.class public final La/cv4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s960;


# static fields
.field public static final a:La/cv4;

.field public static final b:La/sqp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/cv4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/cv4;->a:La/cv4;

    .line 7
    .line 8
    const-string v0, "originAssociatedProductId"

    .line 9
    .line 10
    invoke-static {v0}, La/sqp;->a(Ljava/lang/String;)La/sqp;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/cv4;->b:La/sqp;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/vto;

    .line 2
    .line 3
    check-cast p2, La/t960;

    .line 4
    .line 5
    check-cast p1, La/t35;

    .line 6
    .line 7
    iget-object p0, p1, La/t35;->a:Ljava/lang/Integer;

    .line 8
    .line 9
    sget-object p1, La/cv4;->b:La/sqp;

    .line 10
    .line 11
    invoke-interface {p2, p1, p0}, La/t960;->a(La/sqp;Ljava/lang/Object;)La/t960;

    .line 12
    .line 13
    .line 14
    return-void
.end method
