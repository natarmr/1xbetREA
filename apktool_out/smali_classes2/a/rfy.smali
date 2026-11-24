.class public final La/rfy;
.super La/g1x;
.source "SourceFile"


# instance fields
.field public final a:La/bfy;

.field public final b:La/bfy;


# direct methods
.method public constructor <init>(La/bfy;La/bfy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rfy;->a:La/bfy;

    .line 5
    .line 6
    iput-object p2, p0, La/rfy;->b:La/bfy;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final o()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/rfy;->a:La/bfy;

    .line 2
    .line 3
    iget-object p0, p0, La/bfy;->b:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method
