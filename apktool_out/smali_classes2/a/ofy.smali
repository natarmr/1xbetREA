.class public final La/ofy;
.super La/g1x;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ofy;->a:Ljava/lang/reflect/Field;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final o()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ofy;->a:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    invoke-static {p0}, La/azw;->K(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
